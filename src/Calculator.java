package src;

public class Calculator {

    private double result = 0;


    public double getResult()
    {
        return result;
    }

    public void add(double x )
    {
        result += x;
    }

    public void subtract (double x)
    {
        result -= x;
    }

    public void clear()
    {
        result = 0;
    }

    public void add (double[] numbers)
    {
        for (double x : numbers)
        {
            result += x;
        }
    }


    public double max (double x, double y)
    {
       return Math.max(x, y);
    }

    public double min (double x, double y)
    {
        return Math.min(x, y);
    }
}
