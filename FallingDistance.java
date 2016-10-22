//Giorgi Amirajibi

import java.text.DecimalFormat;

public class FallingDistance
{
    public static void main (String[] args)
    {
        DecimalFormat decimal = new DecimalFormat("#,###.0");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(decimal.format(fallingDistanceFormula(i)));
        }
    }
    public static double fallingDistanceFormula (double t)
    {
        double d, g = 9.8;
        d = 1/2.0 * g * Math.pow(t,2);
        return d;
    }
}
