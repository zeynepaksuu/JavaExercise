package Week5.Exercises.Records;

public record Bird(int numberEggs, String name) {

    public Bird(int numberEggs, String name, String nickname) {
        this(numberEggs,name + " " + nickname);
    }
}
