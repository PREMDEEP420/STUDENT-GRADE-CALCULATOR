import java.util.Scanner;

public class MarksCalculator {

    // Method to determine the grade based on the average percentage
    public static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Variables to store total marks and individual subject marks
        double totalMarks = 0.0;

        // Input: Marks for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            double marks = scanner.nextDouble();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input! Marks must be between 0 and 100.");
                return;
            }
            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = totalMarks / numSubjects;

        // Determine grade
        String grade = calculateGrade(averagePercentage);

        // Display results
        System.out.println("\n--- Results ---");
        System.out.printf("Total Marks: %.2f%n", totalMarks);
        System.out.printf("Average Percentage: %.2f%%%n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
