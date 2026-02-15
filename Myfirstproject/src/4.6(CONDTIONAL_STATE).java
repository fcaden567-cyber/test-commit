/**
 * Exercise 4.6.1 - All Programs Combined
 * Conditional Compound Operators
 */
import java.util.Scanner;

class Exercise4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter a whole number (>0): ");
        int number = scanner.nextInt();
        
        // Validate input is positive
        if (number <= 0) {
            System.out. println("Error: Please enter a number greater than 0");
            scanner.close();
            return;
        }
        
        System.out.println("\n===== DIVISIBILITY TESTS FOR " + number + " =====\n");
        
        // Program 1: Divisible by 2 AND 3
        if (number % 2 == 0 && number % 3 == 0) {
            System. out.println("1) " + number + " IS divisible by 2 and 3");
        } else {
            System.out.println("1) " + number + " is NOT divisible by 2 and 3");
        }
        
        // Program 2: Divisible by 7 OR 9
        if (number % 7 == 0 || number % 9 == 0) {
            System.out.println("2) " + number + " IS divisible by 7 or 9");
        } else {
            System.out.println("2) " + number + " is NOT divisible by 7 or 9");
        }
        
        // Program 3: Divisible by 2 AND 3 BUT NOT 5
        if (number % 2 == 0 && number % 3 == 0 && number % 5 != 0) {
            System.out.println("3) " + number + " IS divisible by 2 and 3, but not 5");
        } else {
            System.out. println("3) " + number + " is NOT divisible by 2 and 3, or it is divisible by 5");
        }
        
        scanner.close();
    }
}