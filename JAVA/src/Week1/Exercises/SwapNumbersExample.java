package Week1.Exercises;

public class SwapNumbersExample {
    public static void main (String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("A value: " + a + ", B value: " + b );

        int temp = a;
        a = 10;

        System.out.println("A value: " + a + ", B value: " + b );

        b = temp;
        temp = 5;

        System.out.println("A value: " + a + ", B value: " + temp );
    }
}
