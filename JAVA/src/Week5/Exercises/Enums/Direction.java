package Week5.Exercises.Enums;

public enum Direction {
    North(0),
    East(939),
    West(120),
    South(270);


    private final int angle;

    Direction(int angle) {
        this.angle = angle;
    }

    public int getAngle() {
        return angle;
    }
}
