/**
 * Days Alive Calculator
 * Calculates how many days a person has been alive
 */
import java.util.Scanner;

class DaysAlive {
    
    /**
     * Check if a year is a leap year
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    /**
     * Get the number of days in a month
     */
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }
    
    /**
     * Get the number of days in a year
     */
    public static int getDaysInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }
    
    /**
     * Calculate days from start of year to a specific date
     */
    public static int dayOfYear(int day, int month, int year) {
        int totalDays = 0;
        
        for (int m = 1; m < month; m++) {
            totalDays += getDaysInMonth(m, year);
        }
        totalDays += day;
        
        return totalDays;
    }
    
    /**
     * Calculate total days between two dates
     */
    public static int daysAlive(int birthDay, int birthMonth, int birthYear,
                                 int currentDay, int currentMonth, int currentYear) {
        int totalDays = 0;
        
        // Days remaining in birth year
        int daysInBirthYear = getDaysInYear(birthYear);
        int birthDayOfYear = dayOfYear(birthDay, birthMonth, birthYear);
        totalDays += daysInBirthYear - birthDayOfYear;
        
        // Full years in between
        for (int year = birthYear + 1; year < currentYear; year++) {
            totalDays += getDaysInYear(year);
        }
        
        // Days in current year (if different from birth year)
        if (currentYear > birthYear) {
            totalDays += dayOfYear(currentDay, currentMonth, currentYear);
        }
        
        return totalDays;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===========================================");
        System.out.println("  DAYS ALIVE CALCULATOR");
        System.out.println("===========================================\n");
        
        // Get birth date
        System.out.println("Enter your date of birth:");
        System.out.print("  Day (1-31): ");
        int birthDay = scanner.nextInt();
        
        System.out. print("  Month (1-12): ");
        int birthMonth = scanner.nextInt();
        
        System.out.print("  Year: ");
        int birthYear = scanner.nextInt();
        
        // Get current date
        System.out.println("\nEnter current date:");
        System.out. print("  Day (1-31): ");
        int currentDay = scanner.nextInt();
        
        System.out.print("  Month (1-12): ");
        int currentMonth = scanner.nextInt();
        
        System.out.print("  Year: ");
        int currentYear = scanner.nextInt();
        
        // Calculate days alive
        int days = daysAlive(birthDay, birthMonth, birthYear, 
                            currentDay, currentMonth, currentYear);
        
        System.out. println("\n===========================================");
        System.out.println("You have been alive for " + days + " days!");
        System.out.println("That's approximately:");
        System.out.println("  - " + (days / 7) + " weeks");
        System.out.println("  - " + (days / 30) + " months");
        System.out.println("  - " + String.format("%.2f", days / 365.25) + " years");
        System.out.println("===========================================");
        
        scanner.close();
    }
}