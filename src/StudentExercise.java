import java.util.Scanner;

public class StudentExercise {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Student first name ? ");
        String firstName = input.next();
        System.out.println("Student last name ? ");
        String lastName = input.next();
        System.out.println("Student major ? ");
        String major = input.next();
        System.out.println("Expected graduate  year ? ");
        int year = input.nextInt();
        System.out.println("GPA ? ");
        double gpa = input.nextDouble();
        StudentA std = new StudentA(firstName,lastName, major,year,gpa);

        System.out.println("increment one year ? (YES/NO)");
        String answer = input.next();
        if (answer.equalsIgnoreCase("Yes"))
        {
            std.incrementExpeGradYear();
        }
        System.out.println(std.yearGrad);
    }
}
