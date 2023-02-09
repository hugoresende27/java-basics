import java.util.Scanner;

public class SalaryCalculator {

    public static double salaryCalc(double hoursPerWeek, double ratePerHour, int vacDays)
    {
        if (hoursPerWeek < 0)
        {
            return -1;
        }
        if (ratePerHour < 0)
        {
            return -1;
        }
        if (vacDays < 0)
        {
            return -1;
        }
        double weeks = 52.17857;
        double vacHours = vacDays * 8;
        double totalHours = (hoursPerWeek * weeks) - vacHours;
        if (totalHours < 0)
        {
            return -1;
        }
        return totalHours * ratePerHour;

    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Hello, how many hours per week ?");
        double hours = inp.nextDouble();
        System.out.println("Rate per hour?");
        double rate = inp.nextDouble();
        System.out.println("How many vacation days?");
        int vacDays = inp.nextInt();

        double res = salaryCalc(hours,rate, vacDays);
        if (res < 0)
        {
            System.out.println("Incorrect values");
            return ;
        }

        System.out.println("Gross salary is " + res + " €");
    }
}
