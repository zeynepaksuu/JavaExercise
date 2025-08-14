package Week5.Exercises.NestedClasses;

public class Outer {
    static class Nested {
        public void nestedDisplay() {
            System.out.println("Static inner nested class, public method");

        }

        private void privatenestedDisplay() {
            System.out.println("Static private nested class, private method");

        }
    }

    //burası sayesinde implementasyonları sakladım cunku zaten burası yukarıyı cagırıyor, baska bir classtan buraya ulasamayız
    public void outDisplay() {
        Outer.Nested nested = new Outer.Nested();
        nested.nestedDisplay();
        nested.privatenestedDisplay();
    }
}
