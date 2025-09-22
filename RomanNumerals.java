import java.util.Scanner;

/**
 * This program converts a number entered by the user into its Roman numeral equivalent.
 * Valid numbers are between 1 and 3. Any number outside this range is invalid.
 * 
 * @author Yurii Shyba
 * @version 1.0
 * @since 09/20/2025
 */
public class RomanNumerals {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-3): ");
        number = scanner.nextInt();
        
        switch (number) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
        
    }
}
