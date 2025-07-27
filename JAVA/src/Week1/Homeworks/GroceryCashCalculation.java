package Week1.Homeworks;
import java.util.Scanner;

public class GroceryCashCalculation {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5.00;

        System.out.print( "How many kilograms of pears? : ");
        double pkg = scanner.nextDouble();
        System.out.print( "How many kilograms of apple? : ");
        double akg = scanner.nextDouble();
        System.out.print( "How many kilograms of tomato? : ");
        double tkg = scanner.nextDouble();
        System.out.print( "How many kilograms of banana? : ");
        double bkg = scanner.nextDouble();
        System.out.print( "How many kilograms of eggplant? : ");
        double ekg = scanner.nextDouble();

       double cash = pear * pkg + apple * akg + tomato * tkg + banana * bkg + eggplant * ekg;
       System.out.println( "Total cash : " + cash);
    }
}
