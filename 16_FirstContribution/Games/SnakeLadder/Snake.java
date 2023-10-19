package Games.SnakeLadder;

import java.util.HashSet;
import java.util.Set;

public class Snake {
    private static final Set<Integer> uniqueFacePositions = new HashSet<>();
    private final Integer face;
    private final Integer tail;
    public Snake(Integer face, Integer tail) {
        if (!uniqueFacePositions.contains(face)) {
            this.face = face;
            this.tail = tail;
            uniqueFacePositions.add(face);
        } else {
            this.face = this.tail = -1;
        }
    }

    public Integer getFace() {
        return face;
    }

    public Integer getTail() {
        return tail;
    }
}
