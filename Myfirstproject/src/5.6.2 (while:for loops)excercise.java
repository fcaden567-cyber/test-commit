/**
 * Exercise 5.6.2 - Generating Sequences Using For Loops
 * Print number patterns directly
 */
class SequenceGenerator {
    public static void main(String[] args) {
        
        // Sequence 1: 4,5,6,7,8,9,10,11
        System.out. print("1. ");
        for (int i = 4; i <= 11; i++) {
            System.out.print(i);
            if (i < 11) {
                System.out.print(",");
            }
        }
        System.out.println();
        
        // Sequence 2: 10, 13, 16, 19 (starts at 10, increments by 3)
        System.out.print("2. ");
        for (int i = 10; i <= 19; i += 3) {
            System.out.print(i);
            if (i < 19) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        // Sequence 3: 1, 4, 7, 10, 13, 16 (starts at 1, increments by 3)
        System.out.print("3. ");
        for (int i = 1; i <= 16; i += 3) {
            System.out. print(i);
            if (i < 16) {
                System.out. print(", ");
            }
        }
        System.out.println();
        
        // Sequence 4: 2, 4, 6, 8, 10, 12 (even numbers from 2 to 12)
        System.out.print("4. ");
        for (int i = 2; i <= 12; i += 2) {
            System.out. print(i);
            if (i < 12) {
                System.out. print(", ");
            }
        }
        System.out.println();
        
        // Sequence 5: 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 (perfect squares)
        System.out.print("5. ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i);
            if (i < 10) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        // Sequence 6: -10, -8, -6, -4, -2, 0, 2, 4, 6, 8, 10 (from -10 to 10, step 2)
        System.out. print("6. ");
        for (int i = -10; i <= 10; i += 2) {
            System. out.print(i);
            if (i < 10) {
                System. out.print(", ");
            }
        }
        System.out.println();
        
        // Sequence 7: -20, -15, -10, -5, 5, 10, 15, 20 (from -20 to 20, step 5, skip 0)
        System.out.print("7. ");
        for (int i = -20; i <= 20; i += 5) {
            if (i != 0) {  // Skip 0
                System.out. print(i);
                if (i < 20) {
                    System.out.print(", ");
                }
            }
        }
        System.out. println();
        
        System.out.println("\n===== ALL SEQUENCES COMPLETE =====");
    }
}