import java.util.Scanner;

public class FortuneTeller {

    public static void main(String[] args) {

        System.out.println("Pick a number between 1 and 10");

        Scanner pick = new Scanner(System.in);

        System.out.println(pick);

        int number = pick.nextInt();

        if (number < 5)
        {
            System.out.println("Your number is less then 5 "+ number);
        }
        else if (number == 5)
        {
            System.out.println("Your number is  5");
        }
        else
        {
            System.out.println("Your number is bigger then 5");
        }

    }
}
