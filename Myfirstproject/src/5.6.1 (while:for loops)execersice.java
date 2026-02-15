/**
 * Exercise 5.6.1 - Generating Patterns Using For Loops
 * Based on Equation (6): Print + if i is even, - if i is odd
 */
class PatternGenerator {
    public static void main(String[] args) {
        
        // Pattern 1: "++++++++++" (10 plus signs)
        System.out.print("1.  \"");
        for (int i = 1; i <= 10; i++) {
            System.out.print("+");

        }
        System.out.println("\"");
        
        // Pattern 2: "---------" (9 minus signs)
        System.out.print("2. \"");
        for (int i = 1; i <= 9; i++) {
            System.out.print("-");
        }
        System.out. println("\"");
        
        // Pattern 3: "+-+-+-+-+-" (alternating + and -, starting with +)
        System.out.print("3. \"");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {  // odd position
                System.out. print("+");
            } else {           // even position
                System.out.print("-");
            }
        }
        System.out.println("\"");
        
        // Pattern 4: "*+-*+-*+-" (repeating *+- pattern)
        System.out.print("4. \"");
        for (int i = 1; i <= 9; i++) {
            if (i % 3 == 1) {
                System.out. print("*");
            } else if (i % 3 == 2) {
                System. out.print("+");
            } else {
                System.out.print("-");
            }
        }
        System.out.println("\"");
        
        // Pattern 5: "*+-*+-*+-*" (repeating *+- pattern, 10 chars)
        System.out.print("5. \"");
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 1) {
                System.out.print("*");
            } else if (i % 3 == 2) {
                System. out.print("+");
            } else {
                System. out.print("-");
            }
        }
        System. out.println("\"");
        
        // Pattern 6: "**++**++**++" (repeating **++ pattern)
        System.out.print("6. \"");
        for (int i = 1; i <= 12; i++) {
            if (i % 4 == 1 || i % 4 == 2) {
                System. out.print("*");
            } else {
                System. out.print("+");
            }
        }
        System.out.println("\"");
        
        // Pattern 7: "***+++---***+++---" (repeating ***+++--- pattern)
        System.out.print("7. \"");
        for (int i = 1; i <= 18; i++) {
            int pos = (i - 1) % 9;  // 0-8 repeating
            if (pos < 3) {
                System.out.print("*");
            } else if (pos < 6) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
        System.out.println("\"");
        
        // Pattern 8: "***+++------+++***" (mirror pattern)
        System.out.print("8. \"");
        for (int i = 1; i <= 18; i++) {
            if (i <= 3 || i >= 16) {
                System.out.print("*");
            } else if (i <= 6 || i >= 13) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
        System.out.println("\"");
        
        System.out.println("\n===== ALL PATTERNS COMPLETE =====");
    }
}