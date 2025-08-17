package Week5.Exercises.Lambdas;

public class CheckifHopper implements CheckTrait{

    @Override
    public boolean test(Zoo zoo) {
        return zoo.canHop();
    }
}
