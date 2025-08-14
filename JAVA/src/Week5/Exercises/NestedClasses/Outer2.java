package Week5.Exercises.NestedClasses;

public class Outer2 {
    static class Inner {
        void innerdisplay() {
            System.out.println("non static inner class");
        }
    }

    public void outer2display() {
        System.out.println("outher2display class");
    }
}
