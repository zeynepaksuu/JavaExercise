package Week2.Exercises;

public class Factorial {

    public static void main(String[] args) {
        int result = factorial(5); // 5! = 120
        System.out.println(result);
    }

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
