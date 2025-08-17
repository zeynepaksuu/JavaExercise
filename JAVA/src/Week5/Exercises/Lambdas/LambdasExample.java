package Week5.Exercises.Lambdas;

public class LambdasExample {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {

            @Override
            public void method(String string) {
                System.out.println("Hello " + string);

            }
        };
        greeting.method("cem");

        //java8 sonrası

        Greeting greeting1 = (name) -> System.out.println("hello " + name);
        greeting1.method("zeynep");



    }
}
