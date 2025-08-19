package Week5.Exercises.FunctionalInterfaces;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MathOperation sum = (number1, number2) -> number1 + number2;
        MathOperation multiply = (int a, int b) -> a*b;

        //method cagırma işlemi burda gerçekleşir
        System.out.println("toplam: " +sum.operate(2,5));
        System.out.println(("çarpım: " +multiply.operate(3,6)));
    }
}
