/**
 * Fibonacci Sequence (Non-Recursive)
 * Displays the first n Fibonacci numbers
 */
import java.util. Scanner;

class FibonacciNonRecursive {
    
    /**
     * Display first n Fibonacci numbers
     */
    public static void displayFibonacci(int n) {
        if (n <= 0) {
            System.out. println("Error: Please enter a positive integer!");
            return;
        }
        
        long first = 0;
        long second = 1;
        
        System.out.println("First " + n + " Fibonacci numbers:");

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(first);
            } else if (i == 2) {
                System.out.print(", " + second);
            } else {
                long next = first + second;
                System. out.print(", " + next);
                first = second;
                second = next;
            }
        }
        System.out.println();
    }
    
    /**
     * Get nth Fibonacci number
     */
    public static long getFibonacci(int n) {
        if (n <= 0) {
            return -1; // Error
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        
        long first = 0;
        long second = 1;
        long result = 0;
        
        for (int i = 3; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===========================================");
        System.out.println("  FIBONACCI SEQUENCE (NON-RECURSIVE)");
        System.out.println("===========================================\n");
        
        System.out.print("Enter n (number of Fibonacci numbers to display): ");
        int n = scanner. nextInt();
        
        displayFibonacci(n);
        
        // Test cases
        System.out.println("\n--- Individual Fibonacci Numbers ---");
        for (int i = 1; i <= 15; i++) {
            System.out. println("Fib(" + i + ") = " + getFibonacci(i));
        }
        
        scanner.close();
    }
}