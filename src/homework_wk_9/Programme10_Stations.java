package homework_wk_9;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
/*
Write a programme that tells you which line passes through particular stations.
Just use Zone 1 stations name.
 */
public class Programme10_Stations {
        public static void main(String[] args) {
            // Creating a map of stations and the lines they belong to
            HashMap<String, HashSet<String>> stations = new HashMap<>();

            // Adding Zone 1 stations and their corresponding lines
            addStation(stations, "Bank", "Central", "Northern", "Waterloo & City", "DLR");
            addStation(stations, "London Bridge", "Northern", "Jubilee");
            addStation(stations, "Waterloo", "Bakerloo", "Jubilee", "Northern");
            addStation(stations, "Oxford Circus", "Victoria", "Bakerloo", "Central Lines");
            addStation(stations, "Circle", "Circle", "Hammersmith & City", "District", "Metropolitan");
            addStation(stations, "Green Park", "Picadilly", "Jubilee", "Victoria");

            // Taking input from the user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of the first station: ");
            String station1 = scanner.nextLine();
            System.out.println("Enter the name of the second station: ");
            String station2 = scanner.nextLine();

            // Checking if both stations are in the map
            if (stations.containsKey(station1) && stations.containsKey(station2)) {
                // Finding the lines that pass through both stations
                HashSet<String> lines1 = stations.get(station1);
                HashSet<String> lines2 = stations.get(station2);
                lines1.retainAll(lines2);

                if (!lines1.isEmpty()) {
                    System.out.println("The following lines pass through both stations:");
                    for (String line : lines1) {
                        System.out.println(line);
                    }
                } else {
                    System.out.println("There are no lines passing through both stations.");
                }
            } else {
                System.out.println("Invalid station names entered.");
            }
            scanner.close();
        }

        // Helper method to add stations and their lines to the map
        private static void addStation(HashMap<String, HashSet<String>> stations, String station, String... lines) {
            HashSet<String> lineSet = new HashSet<>();
            for (String line : lines) {
                lineSet.add(line);
            }
            stations.put(station, lineSet);
        }
    }
