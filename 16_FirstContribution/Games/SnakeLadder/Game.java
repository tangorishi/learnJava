package Games.SnakeLadder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    private List<Player> players;
    private Map<Integer, Snake> snakePositionMapping;
    private Map<Integer, Ladder> ladderPositionMapping;
    public Integer turn; // shows user id whose turn was previous
    public Integer minPosition;
    public Integer maxPosition;
    private Game() {
        this.turn = -1;
        this.minPosition = 1;
        this.maxPosition = 100;
    }

    public Game playNext() {
        if (players.isEmpty()) return this;
        turn = (turn + 1)%players.size();
        Player player = players.get(turn);
        // THROW DICE
        System.out.println("----- " + player.getName() + "'s turn --");
        Integer dicePos = (int)(Math.random()*6 + 1);
        System.out.println("Dice rolled " + dicePos);
        Integer finalPosition = player.getPosition() + dicePos;
        if (this.ladderPositionMapping.containsKey(finalPosition)) {
            Integer prevPosition = finalPosition;
            finalPosition = Math.min(this.maxPosition, this.ladderPositionMapping.get(finalPosition).getTo());
            System.out.println("WoHoo!! Climbed up a ladder at position: " + prevPosition + " to position: " + finalPosition);
        }
        if (this.snakePositionMapping.containsKey(finalPosition)) {
            Integer prevPosition = finalPosition;
            finalPosition = Math.max(minPosition, this.snakePositionMapping.get(finalPosition).getTail());
            System.out.println("Damn, bit by a snake at position: " + prevPosition + " now will be moved to position: " + finalPosition);
        }
        player.setPosition(finalPosition);
        System.out.println("Final Position after turn: " + finalPosition);

        if (finalPosition.equals(maxPosition)) {
            System.out.println("WoHoo!! " + player.getName() + " Finished the game!!");
            this.players.remove(player);
        }

        return this;
    }

    public static class GameBuilder {
        private final List<Player> players;
        private final List<Snake> snakes;
        private final List<Ladder> ladders;
        public GameBuilder() {
            this.players = new ArrayList<>();
            this.snakes = new ArrayList<>();
            this.ladders = new ArrayList<>();
        }
        public GameBuilder addPlayer(Player player) {
            if (player != null) {
                this.players.add(player);
            }
            return this;
        }
        public GameBuilder addSnake(Snake snake) {
            if (snake != null) {
                this.snakes.add(snake);
            }
            return this;
        }

        public GameBuilder addLadder(Ladder ladder) {
            if (ladder != null) {
                this.ladders.add(ladder);
            }
            return this;
        }

        public Game build() {
            Map<Integer, Ladder> laddersPositionMapping = new HashMap<>();
            this.ladders.stream().forEach(ladder -> {
                laddersPositionMapping.put(ladder.getFrom(), ladder);
            });
            Map<Integer, Snake> snakePositionMapping = new HashMap<>();
            this.snakes.stream().forEach(snake -> {
                snakePositionMapping.put(snake.getFace(), snake);
            });

            Game game = new Game();
//            game.playerIdMapping = playerIdMapping;
            game.ladderPositionMapping = laddersPositionMapping;
            game.snakePositionMapping = snakePositionMapping;
            game.players = this.players;
            return game;
        }
    }

}
