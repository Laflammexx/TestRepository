/***********************
Jermaine Council
November 4, 2016
PresentValue Method 
***********************/

import java.util.*;
import java.text.DecimalFormat;

public class PresentValue
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat num = new DecimalFormat("$#,###.00");
      double presentValue, futureValue, interest, total;
      int years;
      
      System.out.println("Please enter future value: ");
      futureValue = keyboard.nextDouble();
      
      while(futureValue < 0)
      {
         System.out.println("Please enter a positive value.");
         futureValue = keyboard.nextDouble();
      }
      
      System.out.println("Enter the number of years to accumulate: ");
      years = keyboard.nextInt();
      
      while(years < 0)
      {
         System.out.println("There cannot be negative years. Please enter again.");
         years = keyboard.nextInt();
      }   
      
      System.out.println("Enter the annual interest rate: ");
      interest = keyboard.nextDouble();
      
      while(interest < 0)
      {
         System.out.println("Please enter a positive value.");
         interest = keyboard.nextDouble();
      }   
      
      total = presentValue(futureValue, years, interest);
      
      System.out.println("The present value is " + num.format(total));    
   }   
   
   public static double presentValue(double f, int y, double i)
   {
      double x;
      x = f/Math.pow((1+i/100),y);
      return x;
   }
}      