/**
 * Exercise 4.6.2 - Complete Solution (Both Parts)
 * Sorting Three Numbers and Three Names
 */
import java.util.Scanner;

public class Exercise4_6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║       EXERCISE 4.6.2 - SORTING BASED ON CONDITIONS        ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝\n");
        
        // ==================== PART 1: SORT THREE NUMBERS ====================
        System. out.println("─────────────────────────────────────────────");
        System.out.println("  PART 1: SORT THREE NUMBERS");
        System.out. println("─────────────────────────────────────────────\n");
        
        // Example from the exercise
        double a = 10;
        double b = -10;
        double c = 3;
        
        System.out.println("Given: a = " + a + ", b = " + b + ", c = " + c);
        sortAndDisplayNumbers(a, b, c);
        
        // Additional test cases
        System. out.println("\n--- Additional Test Cases ---");
        
        sortAndDisplayNumbers(5, 5, 5);      // All equal
        sortAndDisplayNumbers(1, 2, 3);      // Already sorted
        sortAndDisplayNumbers(3, 2, 1);      // Reverse order
        sortAndDisplayNumbers(-5, 0, 5);     // Negative, zero, positive
        sortAndDisplayNumbers(2, 5, 2.3); // Decimals
        
        // ==================== PART 2: SORT THREE NAMES ====================
        System.out.println("\n─────────────────────────────────────────────");
        System.out.println("  PART 2: SORT THREE NAMES");
        System.out.println("─────────────────────────────────────────────\n");
        
        // Test cases for names
        sortAndDisplayNames("Charlie", "Alice", "Bob");
        sortAndDisplayNames("Zebra", "Apple", "Mango");
        sortAndDisplayNames("John", "john", "JOHN");  // Case comparison
        sortAndDisplayNames("Anna", "Anne", "Ann");   // Similar names
        
        // ==================== INTERACTIVE MODE ====================
        System.out.println("\n─────────────────────────────────────────────");
        System.out. println("  INTERACTIVE MODE");
        System.out.println("─────────────────────────────────────────────\n");
        
        System.out.print("Do you want to enter your own values? (yes/no): ");
        String choice = scanner.nextLine().trim().toLowerCase();
        
        if (choice. equals("yes") || choice.equals("y")) {
            // Numbers
            System.out. println("\nEnter three numbers:");
            System.out.print("a = ");
            double userA = scanner.nextDouble();
            System.out.print("b = ");
            double userB = scanner.nextDouble();
            System.out. print("c = ");
            double userC = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            sortAndDisplayNumbers(userA, userB, userC);
            
            // Names
            System. out.println("\nEnter three names:");
            System.out.print("name1 = ");
            String userName1 = scanner. nextLine();
            System.out.print("name2 = ");
            String userName2 = scanner. nextLine();
            System.out.print("name3 = ");
            String userName3 = scanner. nextLine();
            
            sortAndDisplayNames(userName1, userName2, userName3);
        }
        
        System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║                    PROGRAM COMPLETE                        ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
        
        scanner.close();
    }
    
    /**
     * Sort and display three numbers in ascending order
     */
    public static void sortAndDisplayNumbers(double a, double b, double c) {
        String first, second, third;
        double firstVal, secondVal, thirdVal;
        
        if (a <= b && a <= c) {
            first = "a";
            firstVal = a;
            if (b <= c) {
                second = "b"; third = "c";
                secondVal = b; thirdVal = c;
            } else {
                second = "c"; third = "b";
                secondVal = c; thirdVal = b;
            }
        } else if (b <= a && b <= c) {
            first = "b";
            firstVal = b;
            if (a <= c) {
                second = "a"; third = "c";
                secondVal = a; thirdVal = c;
            } else {
                second = "c"; third = "a";
                secondVal = c; thirdVal = a;
            }
        } else {
            first = "c";
            firstVal = c;
            if (a <= b) {
                second = "a"; third = "b";
                secondVal = a; thirdVal = b;
            } else {
                second = "b"; third = "a";
                secondVal = b; thirdVal = a;
            }
        }
        
        System.out.println("The correct order is '" + first + "' <= '" + second + "' <= '" + third + "'");
        System.out.println("  Values: " + firstVal + " <= " + secondVal + " <= " + thirdVal);
    }
    
    /**
     * Sort and display three names in alphabetical order
     */
    public static void sortAndDisplayNames(String name1, String name2, String name3) {
        System.out.println("\nGiven:  name1 = \"" + name1 + "\", name2 = \"" + name2 + "\", name3 = \"" + name3 + "\"");
        
        String first, second, third;
        String firstName, secondName, thirdName;
        
        // Using compareToIgnoreCase for case-insensitive comparison
        if (name1.compareToIgnoreCase(name2) <= 0 && name1.compareToIgnoreCase(name3) <= 0) {
            first = "name1";
            firstName = name1;
            if (name2.compareToIgnoreCase(name3) <= 0) {
                second = "name2"; third = "name3";
                secondName = name2; thirdName = name3;
            } else {
                second = "name3"; third = "name2";
                secondName = name3; thirdName = name2;
            }
        } else if (name2.compareToIgnoreCase(name1) <= 0 && name2.compareToIgnoreCase(name3) <= 0) {
            first = "name2";
            firstName = name2;
            if (name1.compareToIgnoreCase(name3) <= 0) {
                second = "name1"; third = "name3";
                secondName = name1; thirdName = name3;
            } else {
                second = "name3"; third = "name1";
                secondName = name3; thirdName = name1;
            }
        } else {
            first = "name3";
            firstName = name3;
            if (name1.compareToIgnoreCase(name2) <= 0) {
                second = "name1"; third = "name2";
                secondName = name1; thirdName = name2;
            } else {
                second = "name2"; third = "name1";
                secondName = name2; thirdName = name1;
            }
        }
        
        System.out.println("The correct order is '" + first + "' <= '" + second + "' <= '" + third + "'");
        System.out. println("  Names: \"" + firstName + "\" <= \"" + secondName + "\" <= \"" + thirdName + "\"");
    }
}