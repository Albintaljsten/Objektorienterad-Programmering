import java.lang.Math;
public class Raise
{
    public static double recRaiseOne(double x, int k)
    {
        Counters.raiseOne++;
        if (k==0)
        {
            return 1.0;
        }
        else
        {
            return x * recRaiseOne (x, k-1);
        }
    }
    public static double recRaiseHalf (double x, int k)
    {
        Counters.raiseHalf++;
        if (k == 0)
        {
            return 1;
        }
        double var = recRaiseHalf(x, k/2);
        if ((k % 2) == 0)
        {
            return var*var;
        }
        else
        {
            return x*var*var;
        }
    }
}
