/***********************
Jermaine Council
October 21, 2016
ExperimentLoop
***********************/

import java.util.Scanner;

public class ExperimentLoop
{
   public static void main (String[] args)
   {    
      Scanner keyboard = new Scanner(System.in);
      int experiment, results, counter;
      double average, testResults, sum = 0;
      for (experiment = 1; experiment <=4; experiment++)
      {
         System.out.println("Experiment " + experiment);
         System.out.println("Enter the amount of test results you have: ");
         results = keyboard.nextInt();
         while (results < 1 || results > 6)
         {
            System.out.println("That is an invalid number. Please try again.");
            results = keyboard.nextInt();
         }
         for (counter = 1; counter <= results; counter++)
         {
            System.out.println("Enter the value for test result #" + counter);
            testResults = keyboard.nextInt();
            sum = sum + testResults;
         }
         average = sum / results;
         sum = 0;
         System.out.println("The average result for experiment #" + experiment + " = " + average);
      }
   }
}