package Week3.Exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main ( String[] args) {

        ArrayList<Integer> integers = new ArrayList<>(30);
        ArrayList<Integer> integers2 = new ArrayList<>();

        List<String> shoppingList1 = new ArrayList<>();

        //ekledigimiz sırayla ekler
        shoppingList1.add("banana");
        shoppingList1.add("banana"); // iki kere ekleyebiliriz
        shoppingList1.add("apple");
        shoppingList1.add(1, "mango");
        shoppingList1.add(0,"grapes");
        shoppingList1.add("");

        shoppingList1.remove("apple");
        shoppingList1.remove("ejder meyvesi");

        for ( String s : shoppingList1) {
            System.out.println(s);
        }

        boolean isAppleRemoved = shoppingList1.remove("apple");
        System.out.println(" : " + isAppleRemoved);
        boolean isRemoved = shoppingList1.remove("ejder meyvesi");
        System.out.println(" : " +isRemoved);


        List<String> shoppingList2 = new ArrayList<>();
        shoppingList2.add("paper");


        shoppingList1.addAll(shoppingList2);
        System.out.println(shoppingList1);

        System.out.println(shoppingList2.contains("süt"));

        System.out.println("alışveriş listenizde " + shoppingList1.size() + " adet ürün var.");

        System.out.println(shoppingList1.getLast());


        System.out.println("---------LinkedList---------");

        LinkedList<String> linkedList = new LinkedList<>();
        List<String> names = new LinkedList<>();
        names.add("zeynep");
        names.add("aksu");
        names.add("test");

        System.out.println(names);







    }

}
