import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize variables
        int totalMarks = 0;
        double averagePercentage;
        char grade;

        // Input marks for each subject and calculate the total marks
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            
            // Check if marks are within the valid range (0 to 100)
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
                return;
            }
            
            totalMarks += marks;
        }

        // Calculate average percentage
        averagePercentage = (double) totalMarks / numSubjects;

        // Assign grades based on average percentage
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
