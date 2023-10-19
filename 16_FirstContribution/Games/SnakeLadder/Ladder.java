package Games.SnakeLadder;

import java.util.HashSet;
import java.util.Set;

public class Ladder {
    private static final Set<Integer> ladderStartPosition = new HashSet<>();
    private final Integer from;
    private final Integer to;

    public Ladder(Integer from, Integer to) {
        if (!ladderStartPosition.contains(from)) {
            this.from = from;
            this.to = to;
            ladderStartPosition.add(from);
        } else {
            this.from = this.to = -1;
        }
    }

    public Integer getFrom() {
        return from;
    }

    public Integer getTo() {
        return to;
    }
}
