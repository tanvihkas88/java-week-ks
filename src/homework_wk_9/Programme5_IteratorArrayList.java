package homework_wk_9;
/*
Write a Java program to iterate through all elements in an array list using
Iterater.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Programme5_IteratorArrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Mango");

        // Obtaining an iterator for the ArrayList
        Iterator<String> iterator = fruits.iterator();

        // Iterating through the ArrayList using the iterator
        System.out.println("Iterating through the ArrayList using Iterator:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}


