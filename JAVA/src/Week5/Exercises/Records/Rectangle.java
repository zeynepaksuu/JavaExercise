package Week5.Exercises.Records;

public record Rectangle(int with, int height) {
    public int area() {
        return with * height;

    }
}
