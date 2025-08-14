package Week5.Exercises.NestedClasses;

public class NestedClassMain {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outDisplay();

        //static oldugu icin cıktıları görebiliyoruz
        Outer.Nested nested = new Outer.Nested();
        nested.nestedDisplay();

        Outer2.Inner inner = new Outer2.Inner();
        inner.innerdisplay();
    }
}
