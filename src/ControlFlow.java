import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat)
        {
            System.out.println("playing current song");
            System.out.println("Keep playing (Y/N) ? ");

            String answer = input.next();
            if (answer.equalsIgnoreCase("N"))
            {
                isOnRepeat = false;
            }
        }

        System.out.println("Next song");
    }
}
