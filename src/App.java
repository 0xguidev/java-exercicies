import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter student name: ");
        student.name = sc.nextLine();
        System.out.println("Enter grade 1:");
        student.grade1 = sc.nextDouble();

        System.out.println("Enter grade 2:");
        student.grade2 = sc.nextDouble();

        System.out.println("Enter grade 3:");
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.missingPoints());

        if (student.finalGrade() < 60.00) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
