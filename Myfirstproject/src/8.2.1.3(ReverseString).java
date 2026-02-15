/**
 * Reverse String Function
 * Returns a string in reverse order
 */
import java.util.Scanner;

class ReverseString {
    
    /**
     * Reverse a string
     */
    public static String reverse(String str) {
        String reversed = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        return reversed;
    }
    
    /**
     * Alternative:  Reverse using StringBuilder (more efficient)
     */
    public static String reverseEfficient(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===========================================");
        System.out.println("  STRING REVERSER");
        System.out.println("===========================================\n");
        
        System.out.print("Enter a string:  ");
        String input = scanner.nextLine();
        
        String reversed = reverse(input);
        
        System.out. println("Original: " + input);
        System.out.println("Reversed: " + reversed);
        
        // Test cases
        System.out.println("\n--- Test Cases ---");
        String[] testStrings = {"Hello", "World", "Java", "racecar", "12345"};
        for (String str :  testStrings) {
            System.out.println("\"" + str + "\" -> \"" + reverse(str) + "\"");
        }
        
        scanner.close();
    }
}