
import java.util.Scanner;
import java.text.DecimalFormat;

public class Penny
{
    public static  void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat num = new DecimalFormat("#,##0.00");
        int days, pennies = 1, counter;
        double total = 0.0, penny = 0.01;
        System.out.println("Enter the number of days you've worked: ");
        days = keyboard.nextInt();
        System.out.println("Days Pennies");
        if (days > 0)
        {
            for (counter = 1; counter <= days; counter++)
            {
                System.out.println(counter + "\t " + pennies);
                //total = total + pennies;
                pennies *= 2;
                total = total + penny;
                penny *= 2;
            }
            System.out.println("\nTotal Pay = $" + num.format(total));
        }
        else
        {
            System.out.println("You entered an invalid number.");
        }
    }
}
