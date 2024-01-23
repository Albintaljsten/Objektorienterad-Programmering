public class Main
{
    public static void main(String[] args)
    {
        System.out.println("RecRaiseHalf");
        for (int i = 1; i <= 15; i++)
        {
            System.out.println(Raise.recRaiseHalf(1.5, i));
        }

        System.out.println();

        System.out.println("RecRaiseOne");
        for (int i = 1; i <= 15; i++)
        {
        System.out.println(Raise.recRaiseOne(1.5, i));
        }

        System.out.println();
        System.out.println("Amount of calls to recRaiseHalf: " + Counters.raiseHalf);
        System.out.println("Amount of calls to recRaiseOne: " + Counters.raiseOne);
    }
}