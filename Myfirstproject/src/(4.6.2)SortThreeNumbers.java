/**
 * Exercise 4.6.2 - Part 1
 * Given three numbers, display them in ascending order
 */
import java.util.Scanner;

class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===========================================");
        System.out.println("  SORT THREE NUMBERS (ASCENDING ORDER)");
        System.out.println("===========================================\n");
        
        // Get input from user
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();
        
        System.out. print("Enter value for b: ");
        double b = scanner. nextDouble();
        
        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();
        
        System.out.println("\nOriginal values:  a = " + a + ", b = " + b + ", c = " + c);
        
        // Determine the correct order
        String first, second, third;
        double firstVal, secondVal, thirdVal;
        
        if (a <= b && a <= c) {
            // a is smallest
            first = "a";
            firstVal = a;
            if (b <= c) {
                second = "b";
                third = "c";
                secondVal = b;
                thirdVal = c;
            } else {
                second = "c";
                third = "b";
                secondVal = c;
                thirdVal = b;
            }
        } else if (b <= a && b <= c) {
            // b is smallest
            first = "b";
            firstVal = b;
            if (a <= c) {
                second = "a";
                third = "c";
                secondVal = a;
                thirdVal = c;
            } else {
                second = "c";
                third = "a";
                secondVal = c;
                thirdVal = a;
            }
        } else {
            // c is smallest
            first = "c";
            firstVal = c;
            if (a <= b) {
                second = "a";
                third = "b";
                secondVal = a;
                thirdVal = b;
            } else {
                second = "b";
                third = "a";
                secondVal = b;
                thirdVal = a;
            }
        }
        
        // Display result
        System.out.println("\nThe correct order is '" + first + "' <= '" + second + "' <= '" + third + "'");
        System.out.println("Values: " + firstVal + " <= " + secondVal + " <= " + thirdVal);
        
        scanner.close();
    }
}