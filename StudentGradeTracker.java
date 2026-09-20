import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentGrades = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter grade: ");
            int grade = sc.nextInt();
            sc.nextLine();

            studentNames.add(name);
            studentGrades.add(grade);
        }

        int total = 0;
        int highest = studentGrades.get(0);
        int lowest = studentGrades.get(0);

        for (int grade : studentGrades) {
            total += grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = (double) total / n;

        System.out.println("\n===== Student Grade Report =====");

        for (int i = 0; i < n; i++) {
            System.out.println(studentNames.get(i) + " : " + studentGrades.get(i));
        }

        System.out.println("\nAverage Score : " + average);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score  : " + lowest);

        sc.close();
    }
}