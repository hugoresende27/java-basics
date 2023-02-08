import java.util.Scanner;

public class ExerciceA {

    public static void main(String[] args) {

        boolean correct = false;
        while(!correct) {
            System.out.println("What is my name ? ");
            String optA = "Ze";
            String optB = "Hugo";
            String optC = "Carlos";
            System.out.println(optA+" , "+optB+" , "+optC);
            Scanner res = new Scanner(System.in);
            String r = res.next();
            if (r.equalsIgnoreCase(optB))
            {
                System.out.println("CORRECT");
                correct = true;
            }
            else
            {
                System.out.println("MEHHHH, I'm Hugo");
            }
        }

    }
}
