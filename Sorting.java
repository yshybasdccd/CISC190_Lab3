import java.util.Scanner;

/**
 * This program reads three distinct non-negative integers
 * and displays them in increasing order using nested if statements.
 * 
 * @author Yurii Shyba
 * @version 1.0
 * @since 09/21/2025
 */
public class Sorting {
    public static void main(String[] args) {
        int num1, num2, num3;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        num3 = scanner.nextInt();
        
        if (num1 < num2) {
            if (num1 < num3) {
                if (num2 < num3) {
                    System.out.println(num1 + " " + num2 + " " + num3);
                } else {
                    System.out.println(num1 + " " + num3 + " " + num2);
                }
            } else {
                System.out.println(num3 + " " + num1 + " " + num2);
            }
        } else { // num2 < num1
            if (num2 < num3) {
                if (num1 < num3) {
                    System.out.println(num2 + " " + num1 + " " + num3);
                } else {
                    System.out.println(num2 + " " + num3 + " " + num1);
                }
            } else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
        }
        
    }
}
