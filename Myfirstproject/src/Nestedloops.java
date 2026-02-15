public class Nestedloops {

        public static void main(String[] args) {
            System.out.println("╔═══════════════════════════════════════════════════════════╗");
            System.out.println("║           EXERCISE 5.6.4 - NESTED LOOPS                   ║");
            System.out.println("╚═══════════════════════════════════════════════════════════╝\n");

            // Sequence 1: "122333444455555"
            // Pattern: 1 appears 1 time, 2 appears 2 times, 3 appears 3 times, etc.
            System. out.print("1. \"");
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
            }
            System. out.println("\"");
            System.out.println("   Pattern: digit i appears i times (1-5)");

            // Sequence 2: "22333444455555666666"
            // Pattern: starts from 2, digit i appears i times
            System.out. print("\n2. \"");
            for (int i = 2; i <= 6; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
            }
            System. out.println("\"");
            System.out.println("   Pattern: digit i appears i times (2-6)");

            // Sequence 3: "133355555"
            // Pattern: odd numbers only, digit i appears i times
            System.out.print("\n3. \"");
            for (int i = 1; i <= 5; i += 2) {
                for (int j = 1; j <= i; j++) {
                    System. out.print(i);
                }
            }
            System.out.println("\"");
            System.out.println("   Pattern: odd digit i appears i times (1, 3, 5)");

            // Sequence 4: "1335557777"
            // Pattern: odd numbers, digit i appears i times (1, 3, 5, 7)
            System.out.print("\n4. \"");
            for (int i = 1; i <= 7; i += 2) {
                for (int j = 1; j <= i; j++) {
                    System.out. print(i);
                }
            }
            System.out.println("\"");
            System.out.println("   Pattern: odd digit i appears i times (1, 3, 5, 7)");

            // Sequence 5: "555554444333221"
            // Pattern: reverse of sequence 1 (5 down to 1)
            System.out. print("\n5. \"");
            for (int i = 5; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
            }
            System.out. println("\"");
            System.out. println("   Pattern:  digit i appears i times, descending (5-1)");

            // Sequence 6: "544333222211111"
            // Pattern:  5 appears 1 time, 4 appears 2 times, 3 appears 3 times, etc.
            System. out.print("\n6. \"");
            int count = 1;
            for (int i = 5; i >= 1; i--) {
                for (int j = 1; j <= count; j++) {
                    System.out. print(i);
                }
                count++;
            }
            System.out. println("\"");
            System.out. println("   Pattern:  digit i appears (6-i) times, descending");

            // Sequence 7: "+**+++****+++++"
            // Pattern: alternating + and *, count increases (1, 2, 3, 4, 5)
            System.out.print("\n7. \"");
            char symbol = '+';
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out. print(symbol);
                }
                // Alternate between + and *
                symbol = (symbol == '+') ? '*' : '+';
            }
            System.out.println("\"");
            System.out.println("   Pattern: alternating +/* symbols, count 1,2,3,4,5");

            // Sequence 8: "--***++++-----******+++++++"
            // Pattern: alternating -, *, +, count increases by 1 each cycle, repeats
            System. out.print("\n8. \"");
            char[] symbols = {'-', '*', '+'};
            int symbolIndex = 0;
            int repeatCount = 2;

            for (int cycle = 0; cycle < 2; cycle++) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < repeatCount + i; j++) {
                        System.out.print(symbols[symbolIndex % 3]);
                    }
                    symbolIndex++;
                }
                repeatCount += 3;
            }
            System.out. println("\"");
            System.out. println("   Pattern:  -,*,+ cycle with increasing counts");

            System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
            System.out.println("║                    ALL SEQUENCES COMPLETE                  ║");
            System.out.println("╚═══════════════════════════════════════════════════════════╝");
        }
    }

