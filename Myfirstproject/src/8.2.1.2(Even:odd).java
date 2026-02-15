/**
 * Even/Odd Function
 * Returns true if even, false if odd
 */
import java.util.Scanner;

class EvenOdd {
    
    /**
     * Check if an integer is even
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    /**
     * Check if a long is even
     */
    public static boolean isEven(long number) {
        return number % 2 == 0;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===========================================");
        System.out.println("  EVEN/ODD CHECKER");
        System.out.println("===========================================\n");
        
        System.out.print("Enter a number:  ");
        long number = scanner.nextLong();
        
        if (isEven(number)) {
            System.out.println(number + " is EVEN");
        } else {
            System.out.println(number + " is ODD");
        }
        
        // Test cases
        System.out.println("\n--- Test Cases ---");
        int[] testNumbers = {0, 1, 2, -3, -4, 100, 101};
        for (int num : testNumbers) {
            System.out.println(num + " is " + (isEven(num) ? "EVEN" : "ODD"));
        }
        
        scanner.close();
    }
}