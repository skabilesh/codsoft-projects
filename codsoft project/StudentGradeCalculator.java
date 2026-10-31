
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalMarks = 0;
        int subjects;

        System.out.println("==================================");
        System.out.println("     STUDENT GRADE CALCULATOR");
        System.out.println("==================================");

        System.out.print("Enter number of subjects: ");
        subjects = sc.nextInt();

        if (subjects <= 0) {
            System.out.println("Invalid number of subjects!");
            sc.close();
            return;
        }

        for (int i = 1; i <= subjects; i++) {

            int marks;

            while (true) {

                System.out.print("Enter marks for Subject " + i + ": ");

                if (!sc.hasNextInt()) {
                    System.out.println("Please enter a valid number!");
                    sc.next();
                    continue;
                }

                marks = sc.nextInt();

                if (marks >= 0 && marks <= 100) {
                    break;
                }

                System.out.println("Marks must be between 0 and 100!");
            }

            totalMarks = totalMarks + marks;
        }

        double averagePercentage =
                (double) totalMarks / subjects;

        String grade;

        if (averagePercentage >= 90) {
            grade = "A";
        }
        else if (averagePercentage >= 80) {
            grade = "B";
        }
        else if (averagePercentage >= 70) {
            grade = "C";
        }
        else if (averagePercentage >= 60) {
            grade = "D";
        }
        else if (averagePercentage >= 50) {
            grade = "E";
        }
        else {
            grade = "F";
        }

        System.out.println("\n==================================");
        System.out.println("          STUDENT RESULTS");
        System.out.println("==================================");

        System.out.println("Total Subjects: " + subjects);

        System.out.println("Total Marks: " + totalMarks
                + " / " + (subjects * 100));

        System.out.printf("Average Percentage: %.2f%%\n",
                averagePercentage);

        System.out.println("Grade: " + grade);

        System.out.println("==================================");

        sc.close();
    }
}
