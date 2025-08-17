package Week5.Exercises.Lambdas;

public class CheckifSwim implements CheckTrait{

    @Override
    public boolean test(Zoo zoo) {
        return zoo.canSwim();
    }
}
