package Week2.Exercises;

public class MethodTest {
    public static void main (String[] args) {


//        addNumbers(6,7);
//       double sum =  addNumbers(2.4, 5.12);
//        System.out.println(sum);
        Calculation calculation = new Calculation();
        calculation.showTitle();
        int score = calculation.CalculateScore(5);
        System.out.println(score);
        double addNumbers = calculation.addNumbers();
        System.out.println(addNumbers);
    }

    private static void addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }
    private static double addNumbers(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }
}
