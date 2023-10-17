package Games.SnakeLadder;

public class Player {
    private static Integer id = 0;
    private Integer playerId;
    private String name;
    private Integer position;
    public Player(String name) {
        this.playerId = id;
        this.name = name;
        this.position = 0;
        id++;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }
}
