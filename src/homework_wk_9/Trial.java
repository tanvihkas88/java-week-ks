package homework_wk_9;

import java.util.Scanner;

public class Trial {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char choice;

            do {
                System.out.print("\nEnter Student Name: ");
                String name = scanner.next();
                System.out.print("Enter Student Roll Number: ");
                int rollNum = scanner.nextInt();

                int mathsMarks, scienceMarks, englishMarks;

                // Input validation for Maths marks
                do {
                    System.out.print("Enter Marks of Subject Maths: ");
                    mathsMarks = scanner.nextInt();
                    if (mathsMarks < 0 || mathsMarks > 100) {
                        System.out.println("Invalid input! Marks should be between 0 to 100.");
                    }
                } while (mathsMarks < 0 || mathsMarks > 100);

                // Input validation for Science marks
                do {
                    System.out.print("Enter Marks of Subject Science: ");
                    scienceMarks = scanner.nextInt();
                    if (scienceMarks < 0 || scienceMarks > 100) {
                        System.out.println("Invalid input! Marks should be between 0 to 100.");
                    }
                } while (scienceMarks < 0 || scienceMarks > 100);

                // Input validation for English marks
                do {
                    System.out.print("Enter Marks of Subject English: ");
                    englishMarks = scanner.nextInt();
                    if (englishMarks < 0 || englishMarks > 100) {
                        System.out.println("Invalid input! Marks should be between 0 to 100.");
                    }
                } while (englishMarks < 0 || englishMarks > 100);

                int total = mathsMarks + scienceMarks + englishMarks;
                int percentage = (total * 100) / 300;
                String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
                String grade = calculateGrade(percentage, result);
                printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);

                System.out.print("\nWould you like to check another student's mark sheet? (Enter 'Y' or 'N'): ");
                choice = scanner.next().charAt(0);
            } while (choice == 'Y' || choice == 'y');

            scanner.close();
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
            System.out.println("\n-----------------------------");
            System.out.println("|                           |");
            System.out.println("| Mark Sheet                |");
            System.out.println("|___________________________|");
            System.out.println("| Name: " + name + "            |");
            System.out.println("| Roll No: " + rollNum + "           |");
            System.out.println("|___________________________|");
            System.out.println("| Subjects: Marks           |");
            System.out.println("|___________________________|");
            System.out.println("| Math: " + mathsMarks + "           |");
            System.out.println("| Science: " + scienceMarks + "        |");
            System.out.println("| English: " + englishMarks + "        |");
            System.out.println("|___________________________|");
            System.out.println("| Total: " + total + "          |");
            System.out.println("|___________________________|");
            System.out.println("| Percentage: " + percentage + "%       |");
            System.out.println("| Result: " + result + "         |");
            System.out.println("| Grade: " + grade + "            |");
            System.out.println("|___________________________|");
        }
    }


