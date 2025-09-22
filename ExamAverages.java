import java.util.Scanner;

/**
 * This program calculates the average of three exam scores and displays
 * the average along with the corresponding letter grade.
 * 
 * @author Yurii Shyba
 * @version 1.0
 * @since 09/20/2025
 */
public class ExamAverages {
    public static void main(String[] args) {
        int score1, score2, score3;
        double average;
        char grade;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first exam score: ");
        score1 = scanner.nextInt();
        System.out.print("Enter second exam score: ");
        score2 = scanner.nextInt();
        System.out.print("Enter third exam score: ");
        score3 = scanner.nextInt();
        
        average = (double)(score1 + score2 + score3) / 3;
        
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.printf("Average = %.1f, Letter Grade = %c%n", average, grade);
    }
}
