package Week1.Exercises;

public class ArrayExample {
    public static void main (String[] args) {

        int[] number = { 1, 3,12,-4,56,89,31 } ;
        int max = number[0];
        //int max = 0;
        for ( int num : number) {
            if ( num > max) {
                max = num ;
            }
        }
        System.out.println("Max number is : " + max);
    }
}
