/**
 * Exercise 4.6.2 - Part 2
 * Given three names, display them in alphabetical order
 * Uses compareTo() method for String comparison
 */
import java.util. Scanner;

class SortThreeNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===========================================");
        System.out. println("  SORT THREE NAMES (ALPHABETICAL ORDER)");
        System.out.println("===========================================\n");
        
        // Get input from user
        System.out.print("Enter name1: ");
        String name1 = scanner. nextLine();
        
        System.out.print("Enter name2: ");
        String name2 = scanner.nextLine();
        
        System.out.print("Enter name3: ");
        String name3 = scanner.nextLine();
        
        System.out. println("\nOriginal names: name1 = \"" + name1 + "\", name2 = \"" + name2 + "\", name3 = \"" + name3 + "\"");
        
        /*
         * compareTo() returns:
         *   negative value if string1 < string2 (comes before alphabetically)
         *   zero if string1 == string2
         *   positive value if string1 > string2 (comes after alphabetically)
         */
        
        // Determine the correct alphabetical order
        String first, second, third;
        String firstName, secondName, thirdName;
        
        // Compare using compareToIgnoreCase for case-insensitive comparison
        if (name1.compareToIgnoreCase(name2) <= 0 && name1.compareToIgnoreCase(name3) <= 0) {
            // name1 is first alphabetically
            first = "name1";
            firstName = name1;
            if (name2.compareToIgnoreCase(name3) <= 0) {
                second = "name2";
                third = "name3";
                secondName = name2;
                thirdName = name3;
            } else {
                second = "name3";
                third = "name2";
                secondName = name3;
                thirdName = name2;
            }
        } else if (name2.compareToIgnoreCase(name1) <= 0 && name2.compareToIgnoreCase(name3) <= 0) {
            // name2 is first alphabetically
            first = "name2";
            firstName = name2;
            if (name1.compareToIgnoreCase(name3) <= 0) {
                second = "name1";
                third = "name3";
                secondName = name1;
                thirdName = name3;
            } else {
                second = "name3";
                third = "name1";
                secondName = name3;
                thirdName = name1;
            }
        } else {
            // name3 is first alphabetically
            first = "name3";
            firstName = name3;
            if (name1.compareToIgnoreCase(name2) <= 0) {
                second = "name1";
                third = "name2";
                secondName = name1;
                thirdName = name2;
            } else {
                second = "name2";
                third = "name1";
                secondName = name2;
                thirdName = name1;
            }
        }
        
        // Display result
        System.out.println("\nThe correct alphabetical order is '" + first + "' <= '" + second + "' <= '" + third + "'");
        System.out.println("Names: \"" + firstName + "\" <= \"" + secondName + "\" <= \"" + thirdName + "\"");
        
        scanner.close();
    }
}