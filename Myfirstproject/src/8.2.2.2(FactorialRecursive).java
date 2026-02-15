/**
 * Factorial (Recursive)
 * Returns x! for a given number x
 */
import java.util.Scanner;

class FactorialRecursive {
    
    /**
     * Recursive factorial function
     */
    public static long factorial(int x) {
        // Validate input
        if (x < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers!");
        }
        
        // Base case
        if (x == 0 || x == 1) {
            return 1;
        }
        
        // Recursive case
        return x * factorial(x - 1);
    }
    
    /**
     * Factorial using BigInteger for larger values
     */
    public static java.math.BigInteger factorialBig(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers!");
        }
        
        if (x == 0 || x == 1) {
            return java.math.BigInteger.ONE;
        }
        
        return java.math.BigInteger.valueOf(x).multiply(factorialBig(x - 1));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===========================================");
        System.out.println("  FACTORIAL CALCULATOR (RECURSIVE)");
        System.out. println("===========================================\n");
        
        System.out.print("Enter a number: ");
        int x = scanner. nextInt();
        
        try {
            long result = factorial(x);
            System. out.println(x + "! = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Test maximum value for long
        System.out.println("\n--- Testing Maximum Values ---");
        System.out.println("Maximum value of long: " + Long.MAX_VALUE);
        
        for (int i = 1; i <= 25; i++) {
            try {
                long fact = factorial(i);
                System.out.println(i + "! = " + fact);
                
                // Check for overflow (next factorial would overflow)
                if (i < 25 && Long.MAX_VALUE / fact < (i + 1)) {
                    System. out.println("WARNING: Next factorial will overflow long!");
                }
            } catch (Exception e) {
                System.out.println(i + "! - OVERFLOW!");
                break;
            }
        }
        
        // Note: Maximum factorial that fits in long is 20!  = 2432902008176640000
        System.out. println("\nNote: Maximum x where x! fits in long is 20");
        System.out.println("20! = " + factorial(20));
        
        // BigInteger for larger values
        System.out.println("\n--- Using BigInteger for larger values ---");
        System.out.println("50! = " + factorialBig(50));
        
        scanner.close();
    }
}