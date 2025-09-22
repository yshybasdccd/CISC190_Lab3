import java.util.Scanner;

/**
 * This program reads a date in the format mm/dd/yyyy and determines if it is valid.
 * If the date is invalid, a specific reason is displayed.
 * 
 * @author Yurii Shyba
 * @version 1.0
 * @since 09/21/2025
 */
public class ValidDate {
    public static void main(String[] args) {
        int month, day, year;
        boolean isValid = true;
        String message = "";
        
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("/|\\n"); 
        System.out.print("Enter a date (mm/dd/yyyy): ");
        
        month = scanner.nextInt();
        day = scanner.nextInt();
        year = scanner.nextInt();
        
        if (month < 1 || month > 12) {
            isValid = false;
            message = "Months must be 1 to 12";
        } else {

            int daysInMonth;
            switch (month) {
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    if (day > 30) {
                        isValid = false;
                        message = "Cannot have 31 days in this month.";
                    }
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        daysInMonth = 29;
                        if (day > 29) {
                            isValid = false;
                            message = "Cannot have more than 29 days in February of a leap year.";
                        }
                    } else {
                        daysInMonth = 28;
                        if (day > 28) {
                            isValid = false;
                            message = "Cannot have 29 or more days in a non-leap year.";
                        }
                    }
                    break;
                default:
                    daysInMonth = 31;
                    if (day > 31) {
                        isValid = false;
                        message = "Cannot have more than 31 days in any month.";
                    }
            }
            
            if (day < 1) {
                isValid = false;
                message = "Day must be 1 or greater.";
            }
        }
        
        if (isValid) {
            System.out.printf("%d/%d/%d is a valid date.%n", month, day, year);
        } else {
            System.out.printf("%d/%d/%d is not a valid date. %s%n", month, day, year, message);
        }
        
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
