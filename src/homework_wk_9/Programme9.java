package homework_wk_9;
/*
Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */
import java.util.HashMap;
import java.util.Map;

public class Programme9 {
    public static void main(String[] args) {
        // Create a HashMap to store String keys and Integer values
        Map<String, Integer> people = new HashMap<>();

        // Add some entries to the HashMap
        people.put("Vishal", 25);
        people.put("Jagruti", 30);
        people.put("Mukul", 40);
        people.put("Beena", 35);

        // Iterate over the values in the HashMap using a for-each loop
        System.out.println("Values in the HashMap:");
        for (int age : people.values()) {
            System.out.println(age);
        }
    }
}


