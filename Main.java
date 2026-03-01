import java.util.Scanner;
import java.util.ArrayList;
class Subject {
    String courseTitle;
    int courseCredits;
    double percentageScore;
    public Subject(String courseTitle, int courseCredits, double percentageScore) {
        this.courseTitle = courseTitle;
        this.courseCredits = courseCredits;
        this.percentageScore = percentageScore;
    }
}
class GPACalculator {
    ArrayList<Subject> myEnrolledCourses = new ArrayList<>();
    public void addSubject(Subject newCourse) {
        myEnrolledCourses.add(newCourse);
    }
    public double convertToPoints(double scoreToConvert) {
        if (scoreToConvert >= 90) return 4.0;
        else if (scoreToConvert >= 85) return 3.7;
        else if (scoreToConvert >= 80) return 3.3;
        else if (scoreToConvert >= 75) return 3.0;
        else if (scoreToConvert >= 70) return 2.7;
        else if (scoreToConvert >= 65) return 2.3;
        else if (scoreToConvert >= 60) return 2.0;
        else if (scoreToConvert >= 50) return 1.0;
        else return 0.0;
    }
    public double calculateGPA() {
        double accumulatedGradePoints = 0;
        int totalCredits = 0;
        for (Subject currentCourse : myEnrolledCourses) {
            double convertedPoints = convertToPoints(currentCourse.percentageScore);
            accumulatedGradePoints += convertedPoints * currentCourse.courseCredits;
            totalCredits += currentCourse.courseCredits;
        }
        if (totalCredits == 0) return 0;
        return accumulatedGradePoints / totalCredits;
    }
    public int getTotalHours() {
        int sumOfCredits = 0;
        for (Subject currentCourse : myEnrolledCourses) {
            sumOfCredits += currentCourse.courseCredits;
        }
        return sumOfCredits;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GPACalculator studentGpaCalculator = new GPACalculator();
        System.out.print("Enter number of subjects: ");
        int totalNumberOfSubjects = input.nextInt();
        input.nextLine();
        for (int currentSubjectNumber = 1; currentSubjectNumber <= totalNumberOfSubjects; currentSubjectNumber++) {
            System.out.println("\nSubject " + currentSubjectNumber);
            System.out.print("Enter subject name: ");
            String enteredCourseTitle = input.nextLine();
            System.out.print("Enter credit hours: ");
            int enteredCredits = input.nextInt();
            System.out.print("Enter numeric grade: ");
            double enteredScore = input.nextDouble();
            input.nextLine();
            studentGpaCalculator.addSubject(new Subject(enteredCourseTitle, enteredCredits, enteredScore));
        }
        double finalGpaResult = studentGpaCalculator.calculateGPA();
        System.out.println("\nTotal Credit Hours: " + studentGpaCalculator.getTotalHours());
        System.out.printf("Your GPA is: %.2f\n", finalGpaResult);
        if (finalGpaResult >= 3.7)
            System.out.println("Your grade is: Excellent");
        else if (finalGpaResult >= 3.0)
            System.out.println("Your grade is: Very Good");
        else if (finalGpaResult >= 2.0)
            System.out.println("Your grade is: Good");
        else
            System.out.println("Your grade is: Bad");
        input.close();
    }
}