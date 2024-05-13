package homework_wk_9;
/*
Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.
 */
import java.util.ArrayList;
import java.util.List;

public class Programme4_ArrayList {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();

        // Adding colors to the list
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Orange");

        // Printing the collection using for-each loop
        System.out.println("Colors in the collection:");
        for (String color : colorList) {
            System.out.println(color);
        }
    }
}


