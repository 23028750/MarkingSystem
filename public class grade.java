import java.util.Scanner;

public class MarkSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the marks of the student (0-100): ");
        int marks = scanner.nextInt();


        if (marks >= 0 && marks <= 100) {

            if (marks >= 80) {
                System.out.println("Level 7 - Outstanding Achievement.");
            } else if (marks >= 70) {
                System.out.println("Level 6 - Meritorious Achievement.");
            } else if (marks >= 60) {
                System.out.println("Level 5 - Substantial Achievement.");
            } else if (marks >= 50) {
                System.out.println("Level 4 - Moderate Achievement.");
            } else if (marks >= 40) {
                System.out.println("Level 4 - Adequate Achievement.");
            } else if (marks >= 30) {
                System.out.println("Level 3 - Elementary Achievement.");
            } else {
                System.out.println("Level 2 - Not Achieved (Fail).");
            }
        } else {

            System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
        }

       
        scanner.close();
    }
}