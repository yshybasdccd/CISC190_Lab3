import java.util.Scanner;

/**
 * Update from 09/24/2025 contains some logic updates.
 * This program reads a date in the format mm/dd/yyyy and determines if it is valid.
 * If the date is invalid, a specific reason is displayed.
 * 
 * @author Yurii Shyba
 * @version 2.1
 * @since 09/21/2025. v2.1 - 09/24/2025
 */
public class ValidDateUpdated {
    public static void main(String[] args) {
        int month, day, year;
        boolean isValid = false;
        String message = "";

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("/|\\n"); 
        System.out.print("Enter a date (mm/dd/yyyy): ");

        month = scanner.nextInt();
        day = scanner.nextInt();
        year = scanner.nextInt();
        if(day<1)
            message = "Can't have less than 1 day";
        else if(day > 31)
            message = "Can't have more than 31 days";
        else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    isValid = true;
                case 4: case 6: case 9: case 11:
                    if (day <= 30) {
                        isValid = true;
                    }
                    else{
                        message = "Cannot have 31 days in this month.";
                    }
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        if (day <= 29) {
                            isValid = true;
                        }
                        else{
                            message = "Cannot have more than 29 days in February of a leap year.";
                        }
                    } 
                    else {
                        if (day <= 28) {
                            isValid = true;
                        }
                        else
                            message = "Cannot have 29 or more days in a non-leap year.";
                    }
                    break;
                default:
                    message = "Months must be 1 to 12";
            }
        }//end else

        if (isValid) {
            System.out.printf("%d/%d/%d is a valid date.%n", month, day, year);
        } 
        else {
            System.out.printf("%d/%d/%d is not a valid date. %s%n", month, day, year, message);
        }

    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
