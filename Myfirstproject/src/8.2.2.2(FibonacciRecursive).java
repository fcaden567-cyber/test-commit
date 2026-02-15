/**
 * Fibonacci Numbers (Recursive)
 * Returns the nth Fibonacci number
 */
import java. util.Scanner;

 class FibonacciRecursive {
    
    // Counter for tracking number of calls
    public static int callCount = 0;
    
    /**
     * Recursive Fibonacci function
     */
    public static long fib(int n) {
        callCount++;
        
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        
        return fib(n - 1) + fib(n - 2);
    }
    
    /**
     * Get Fibonacci with call count tracking
     */
    public static long fibWithCount(int n) {
        callCount = 0;
        long result = fib(n);
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===========================================");
        System.out.println("  FIBONACCI NUMBERS (RECURSIVE)");
        System.out.println("===========================================\n");
        
        System. out.print("Enter n:  ");
        int n = scanner.nextInt();
        
        long result = fibWithCount(n);
        System.out.println("Fib(" + n + ") = " + result);
        System.out.println("Number of recursive calls: " + callCount);
        
        // Analyze call counts
        System.out.println("\n--- Analysis:  Why are calls always odd? ---");
        System.out.println("n\tFib(n)\tCalls");
        System.out.println("---------------------------");
        
        for (int i = 1; i <= 15; i++) {
            long fibResult = fibWithCount(i);
            System.out.println(i + "\t" + fibResult + "\t" + callCount);
        }
        
        /*
         * Why the number of calls is always odd:
         * 
         * The number of calls C(n) follows the pattern:
         * C(1) = 1
         * C(2) = 1
         * C(n) = C(n-1) + C(n-2) + 1  (for n > 2)
         * 
         * This is because each call to fib(n) makes one call, 
         * plus all calls from fib(n-1) and fib(n-2).
         * 
         * The number of calls is always odd because:
         * C(n) = 2 * Fib(n+1) - 1
         * 
         * Since 2 * Fib(n+1) is always even, subtracting 1 makes it odd. 
         */
        
        System.out.println("\nNote: Number of calls C(n) = 2 * Fib(n+1) - 1");
        System.out.println("This is always odd because 2*Fib(n+1) is even, minus 1 is odd.");
        
        scanner.close();
    }
}