import java.util.Scanner;

public class GradingSystem {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = 5; // Number of students to grade

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter marks for student " + i + " (or -1 to exit): ");
            int marks;

            try {
                marks = scanner.nextInt(); // Read input from user

                if (marks == -1) {
                    // Early exit condition
                    System.out.println("Early exit requested. Ending input.");
                    break;
                }

                if (marks < 0 || marks > 100) {
                    // Validate range of marks
                    System.out.println("Invalid marks. Please enter between 0 and 100.");
                    continue; 
                }

                // Assigning grade using if-else
                String grade;
                if (marks >= 90) {
                    grade = "A";
                } else if (marks >= 80) {
                    grade = "B";
                } else if (marks >= 70) {
                    grade = "C";
                } else if (marks >= 60) {
                    grade = "D";
                } else {
                    grade = "F";
                }

                System.out.println("Grade (if-else): " + grade);

                // Assigning description using switch-case
                switch (grade) {
                    case "A":
                        System.out.println("Excellent performance!");
                        break;
                    case "B":
                        System.out.println("Very good!");
                        break;
                    case "C":
                        System.out.println("Good job.");
                        break;
                    case "D":
                        System.out.println("Passed.");
                        break;
                    case "F":
                        System.out.println("Failed. Better luck next time.");
                        break;
                }

                System.out.println(); // Add line break for readability (got this from a youtube tutorial)

            } catch (Exception e) {
                // Catches non-integer input (e.g., letters or symbols)
                System.out.println("Invalid input. Please enter a valid number.");

                scanner.next(); // Clear the invalid input from scanner buffer

                i--; // Decrease loop counter to retry the same student
            }
        }

        scanner.close(); // Close scanner to free system resource
        System.out.println("Grading session ended.");
    }
}

// N.B these become difficult each time
