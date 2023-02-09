import java.util.Scanner;

public class Chapter5Functions {


    public static void announceDeveloperTeaTime()
    {
        System.out.println("Waiting for dev Tea Time");
        System.out.println("Insert any key to start Tea Time");
        Scanner inp = new Scanner(System.in);
        inp.next();
        System.out.println("Developer Tea time START");
    }
    public static void main(String[] args) {

        System.out.println("Welcome to JAVA");

        announceDeveloperTeaTime();

        System.out.println("Promoted");

    }
}
