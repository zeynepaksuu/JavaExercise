package Week3.Exercises.Generics;

public class BoundedGenericExample <T extends Animal> {

    public T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
