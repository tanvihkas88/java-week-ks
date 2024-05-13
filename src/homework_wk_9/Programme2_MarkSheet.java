package homework_wk_9;
/*
Rewrite the student mark sheet programme (From java-homework-week3
programmes) using if else and while loop.

 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

import java.util.Scanner;

public class Programme2_MarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.next();

        System.out.print("Enter Student Roll Number: ");
        int rollNum = scanner.nextInt();

        int mathsMarks = inputMarks(scanner, "Maths");
        int scienceMarks = inputMarks(scanner, "Science");
        int englishMarks = inputMarks(scanner, "English");

        int total = mathsMarks + scienceMarks + englishMarks;
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);

        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);

        scanner.close();
    }

    public static int inputMarks(Scanner scanner, String subject) {
        int marks;
        do {
            System.out.print("Enter Marks of Subject " + subject + ": ");
            marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input, Marks should be between 0 to 100");
            }
        } while (marks < 0 || marks > 100);
        return marks;
    }

    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, int total, int percentage, String result,
                                         String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name: " + name + "              |");
        System.out.println("| Roll No: " + rollNum + "           |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math: " + mathsMarks + "             |");
        System.out.println("| Science: " + scienceMarks + "          |");
        System.out.println("| English: " + englishMarks + "          |");
        System.out.println("|___________________________|");
        System.out.println("| Total: " + total + "          |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage: " + percentage + "     |");
        System.out.println("| Result: " + result + "          |");
        System.out.println("| Grade: " + grade + "            |");
        System.out.println("|___________________________|");
    }
}
