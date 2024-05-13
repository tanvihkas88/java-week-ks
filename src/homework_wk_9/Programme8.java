package homework_wk_9;
/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
else)
 */
import java.util.HashSet;
import java.util.Set;

public class Programme8 {
    public static void main(String[] args) {
        // Create a HashSet to store Integer objects
        Set<Integer> numberSet = new HashSet<>();

        // Store the numbers 4, 7, and 8 in the set
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        // Display numbers between 1 and 10 that are present in the set
        System.out.println("Numbers between 1 and 10 that are in the set:");
        for (int i = 1; i <= 10; i++) {
            if (numberSet.contains(i)) {
                System.out.println(i);
            }
        }
    }
}


