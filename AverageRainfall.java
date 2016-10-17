//Giorgi Amirajibi

import java.util.Scanner;

public class AverageRainfall
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int monthCounter = 1, yearCounter, years, months = 12, rainfall,totalRainfall = 0;
        System.out.println("Please enter number of years: ");
        years = keyboard.nextInt();
        if (years > 0)
        {
            for (yearCounter = 0; yearCounter < years; yearCounter++)
            {
                for (monthCounter = 1; monthCounter <= months; monthCounter++)
                {
                    System.out.println("Enter inches of rain for month " + monthCounter);
                    rainfall = keyboard.nextInt();
                    totalRainfall = totalRainfall + rainfall;
                }
            }
            System.out.println("Number of months: " + ((monthCounter - 1)*yearCounter));
            System.out.println("Total inches of rainfall for " + (monthCounter-1)*yearCounter + " months: " + totalRainfall);
            System.out.println("Average rainfall per month is: " + (totalRainfall/((monthCounter-1.0)*yearCounter)));
        }
        else
        {
            System.out.println("You entered an invalid number for years");
        }
    }
}