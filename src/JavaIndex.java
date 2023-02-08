import java.util.Scanner;

public class JavaIndex {


    public static void main(String[] args) {

        String string = "Hugo Boss";

        char letter = string.charAt(2);

        String more = " more text";
        int gpa = 99;

        System.out.println(letter);
        System.out.println(string + " ## " + more + " has a GPA of " + gpa);

        Scanner input = new Scanner(System.in);

        double studentGPA = 5.5;


        System.out.println(string + " has a GPA of" + studentGPA +" whats the update ? ");

        studentGPA = input.nextDouble();

        System.out.println(string + " has a GPA of " + studentGPA +" bye bye");

    }
}
