import java.util.Scanner;

public class MealPrice {


    public static double calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate)
    {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax ;
        return result;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Listed meal price ? ");
        double mealPrice = inp.nextDouble();
        System.out.println("Tip rate (%) ? ");
        double tipRate = inp.nextDouble()/100;
        System.out.println("Tax rate (%)? ");
        double taxRate = inp.nextDouble()/100;
        double result = calculateTotalMealPrice(mealPrice,tipRate,taxRate);
        System.out.println("Split bill (Y/N) ? ");
        String answer = inp.next();
        if (answer.equalsIgnoreCase(("Y")))
        {
            System.out.println("How many people ? ");
            int ppl = inp.nextInt();
            System.out.println("Price each = " + result / ppl +" € ");
        }
        else
        {
            System.out.println("Price  = " + result +" € ");
        }
    }
}
