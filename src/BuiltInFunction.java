import java.util.Scanner;

public class BuiltInFunction {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Num 1 ");
        double a = inp.nextInt();
        System.out.println("Num 2 ");
        double b = inp.nextInt();
        double result = Math.pow(a,b);

        System.out.println(result);
    }
}
