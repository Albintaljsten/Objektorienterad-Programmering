public class LifeLength
{
    public static int f1(int a0)
    {
        if (a0 == 1)
        {
            return 1;
        }
        else if ((a0 % 2) == 0)
        {
            return (a0/2);
        }

        return 3 * a0 + 1;
    }
    public static int f2(int a0)
    {
        return f1(f1(a0));
    }
    public static int f4(int a0)
    {
        return f2(f2(a0));
    }
    public static int f8(int a0)
    {
        return f4(f4(a0));
    }
    public static int f16(int a0)
    {
        return f8(f8(a0));
    }
    public static int f32(int a0)
    {
        return f16(f16(a0));
    }
    public static int iterateF(int a0, int n)
    {
        if (n > -1)
        {
            for (int i = 0; i < n; i++)
            {
                a0 = f1(a0);
            }
        }
        else
        {
            throw new Error("n can't be negative");
        }
        return a0;
    }
    public static int iterLifeLength(int a0)
    {
        int life = 0;

        do {
            a0 = f1(a0);
            life += 1;
        } while (a0 != 1);

        return life;
    }
    public static int recLifeLength(int a0)
    {
        if (a0 == 1)
        {
            return 0;
        }
        return recLifeLength(f1(a0)) + 1;
    }

    public static String intsToString(int a0, int life)
    {
        return "The life length of " + a0 + " is " + life + ".";
    }
}
