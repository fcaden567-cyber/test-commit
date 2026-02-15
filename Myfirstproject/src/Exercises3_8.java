public class Exercises3_8 {
    public static void main(String[] args) {
        // Declare variables with initial values
        int a = 100;
        double b = 2.3;
        double c = -52.2;
        boolean d = true;
        String e = "I am ";
        String f = "a student";
        int g = 0;
        char h = '!';

        // Declare constants
        final double pi = 3.14159;
        final String name = "John Doe"; // Replace with your name

        // Declare three more variables with correct types
        long x;
        double y;
        String z;

        // ============================================================
        // Expression 1: y = a + b
        // VALID - int + double = double, can be assigned to double y
        // ============================================================
        y = a + b;
        System.out.println("1) y = a + b = " + y); // 102.3

        // ============================================================
        // Expression 2: y = a + d
        // INVALID - Cannot add int and boolean in Java
        // ============================================================
        // y = a + d; // Compilation error: bad operand types
        System.out.println("2) y = a + d --> INVALID:  Cannot add int and boolean");

        // ============================================================
        // Expression 3: z = e + f
        // VALID - String concatenation
        // ============================================================
        z = e + f;
        System.out.println("3) z = e + f = " + z); // "I am a student"

        // ============================================================
        // Expression 4: y = bc
        // INVALID - 'bc' is not a valid variable name (b*c needs operator)
        // ============================================================
        // y = bc; // Compilation error: cannot find symbol
        // Correct version would be: 
        y = b * c;
        System.out.println("4) y = bc --> INVALID: Missing operator.  y = b * c = " + y);

        // ============================================================
        // Expression 5: pi = 22/7
        // INVALID - pi is a constant (final), cannot be reassigned
        // ============================================================
        // pi = 22/7; // Compilation error: cannot assign value to final variable
        System.out.println("5) pi = 22/7 --> INVALID: Cannot reassign a final constant");
        System.out.println("   Also note: 22/7 = " + (22/7) + " (integer division)");
        System.out. println("   22. 0/7 = " + (22.0/7) + " (floating-point division)");

        // ============================================================
        // Expression 6: z = name / g
        // INVALID - Cannot divide a String by an int
        // ============================================================
        // z = name / g; // Compilation error: bad operand types
        System.out.println("6) z = name / g --> INVALID: Cannot divide String by int");

        // ============================================================
        // Expression 7: z = c / g
        // INVALID - c/g is a double, cannot assign to String z
        // Also:  Division by zero (g = 0)
        // ============================================================
        // z = c / g; // Compilation error:  incompatible types
        System.out.println("7) z = c / g --> INVALID: Cannot assign double to String");
        System.out. println("   Also:  g = 0 would cause division by zero");

        // ============================================================
        // Expression 8: x = 10, x = x^3
        // VALID (with Math.pow) - but needs casting to long
        // ============================================================
        x = 10;
        x = (long) Math.pow(x, 3);
        System.out.println("8) x = 10, x = x^3 = " + x); // 1000

        // ============================================================
        // Expression 9: z = name + " is " + f + h
        // VALID - String concatenation (char h is converted to String)
        // ============================================================
        z = name + " is " + f + h;
        System.out.println("9) z = name + \" is \" + f + h = " + z);

        // ============================================================
        // Expression 10: y = (name + 10)/(name + h)
        // INVALID - Cannot divide Strings
        // ============================================================
        // y = (name + 10) / (name + h); // Compilation error
        System.out.println("10) y = (name + 10)/(name + h) --> INVALID: Cannot divide Strings");

        // ============================================================
        // Expression 11: x = (a + b)/(d + c)
        // INVALID - Cannot add boolean d to double c
        // ============================================================
        // x = (long) ((a + b) / (d + c)); // Compilation error
        System.out. println("11) x = (a + b)/(d + c) --> INVALID: Cannot add boolean to double");

        // ============================================================
        // Expression 12: y = 100.3, y = (y / (a + b)) - c
        // VALID - All numeric operations
        // ============================================================
        y = 100.3;
        y = (y / (a + b)) - c;
        System. out.println("12) y = 100.3, y = (y / (a + b)) - c = " + y);

        // ============================================================
        // Expression 13: x^2 = y^2 + z^2
        // INVALID - Cannot have expression on left side of assignment
        // Also z is a String, cannot square it
        // ============================================================
        // x^2 = y^2 + z^2; // Compilation error
        System.out.println("13) x^2 = y^2 + z^2 --> INVALID:  Cannot have expression on left side");
        System.out.println("    Also: z is String, cannot perform math operations");

        // ============================================================
        // Expression 14: name = "Is " + f - h
        // INVALID - Cannot subtract char from String
        // Also: name is final
        // ============================================================
        // name = "Is " + f - h; // Compilation error
        System.out.println("14) name = \"Is \" + f - h --> INVALID: Cannot subtract from String");
        System.out.println("    Also: name is a final constant");

        // ============================================================
        // Expression 15: y = ((pi+1)/(pi+2))/(pi+3), y = -2
        // VALID - All numeric operations
        // ============================================================
        y = ((pi + 1) / (pi + 2)) / (pi + 3);
        System.out.println("15a) y = ((pi+1)/(pi+2))/(pi+3) = " + y);
        y = -2;
        System. out.println("15b) y = -2 = " + y);

        // ============================================================
        // Expression 16: y = cube root of (y^2 / b)
        // VALID - Using Math.cbrt and Math.pow
        // ============================================================
        y = -2; // Reset y
        y = Math. cbrt(Math.pow(y, 2) / b);
        System.out.println("16) y = cbrt(y^2 / b) = " + y);

        // ============================================================
        // Expression 17: y = b/g, z = y + name
        // PARTIALLY INVALID - b/g causes division by zero (g = 0)
        // z = y + name would be invalid (double + String assigned to String)
        // Actually String concatenation works:  z = y + name is valid
        // ============================================================
        // y = b / g; // Runtime error: division by zero
        System.out.println("17a) y = b/g --> INVALID:  Division by zero (g = 0)");
        y = b / 1; // Using 1 instead to demonstrate
        z = y + name; // This is valid - converts y to String
        System.out. println("17b) z = y + name = " + z);

        // ============================================================
        // Expression 18: z = name, z = b/g + z
        // INVALID - Cannot add double (b/g) to String z
        // Also division by zero
        // ============================================================
        z = name;
        // z = b/g + z; // Compilation error if interpreted as numeric addition
        // But actually: b/g + z would convert to String concatenation
        // However, division by zero still applies
        System.out.println("18) z = name, z = b/g + z --> INVALID: Division by zero (g = 0)");
        // If g wasn't 0: z = b/g + z would work via String concatenation
        z = b/1 + z; // Demo with 1 instead of g
        System.out. println("    With g=1 it would be: z = " + z);

        // ============================================================
        // Expression 19: y = -2.3, y = ay^2 + by + c
        // INVALID - 'ay' and 'by' are not valid (missing operators)
        // ============================================================
        y = -2.3;
        // y = ay^2 + by + c; // Compilation error
        // Correct version: 
        y = a * Math.pow(y, 2) + b * y + c;
        System.out.println("19) y = -2.3, y = ay^2+by+c --> INVALID: Missing operators");
        System.out.println("    Correct: y = a*y^2 + b*y + c = " + y);

        // ============================================================
        // Expression 20: y = y - (a-b)^((b-c)^(c-d))
        // INVALID - Cannot use boolean d in arithmetic expression
        // ^ in Java is XOR, not exponentiation
        // ============================================================
        // y = y - Math.pow((a-b), Math.pow((b-c), (c-d))); // d is boolean
        System.out.println("20) y = y - (a-b)^((b-c)^(c-d)) --> INVALID:");
        System.out.println("    - Cannot use boolean 'd' in arithmetic");
        System.out.println("    - '^' is XOR operator, need Math.pow() for exponents");

        // ============================================================
        // SUMMARY
        // ============================================================
        System.out.println("\n========== SUMMARY ==========");
        System.out.println("VALID expressions:  1, 3, 8, 9, 12, 15, 16");
        System.out.println("INVALID expressions: 2, 4, 5, 6, 7, 10, 11, 13, 14, 17, 18, 19, 20");
    }
}