import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        int tasks;
        Scanner scan = new Scanner(System.in);
        do
        {
            System.out.println("Tasks available to run are: 1, 2, 3, 4 and 6");
            System.out.println("To choose task write 1, 2, 3, 4 or 6");
            tasks = scan.nextInt();
            if (tasks == 0 || tasks == 1 || tasks == 2 || tasks == 3 || tasks == 4 || tasks == 6)
            {
                switch (tasks)
                {
                    case 1:
                        task1();
                        break;
                    case 2:
                        task2();
                        break;
                    case 3:
                        task3();
                        break;
                    case 4:
                        task4();
                        break;
                    case 6:
                        task6();
                        break;
                }
            }
            else
            {
                throw new Error("Invalid value for n");
            }
        } while (tasks != 0);
        scan.close();
    }

    private static void task1() {
        int a0 = 0;
        Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.print("Write a whole number bigger than zero: ");
                a0 = scan.nextInt();
                if (a0 != 0)
                {
                    System.out.print(a0);
                    do {
                        a0 = LifeLength.f1(a0);
                        System.out.print(", " + a0);
                    } while (a0 > 1);
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Error: Not a whole number > 0");
            }
        } while (a0 != 0);
    }
    private static void task2()
    {
        int a0 = 0;
        int n;
        Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.print("Write a whole number bigger than zero --a0-- : ");
                a0 = scan.nextInt();
                if (a0 != 0)
                {
                    System.out.print("Write a whole number bigger than zero --n-- : ");
                    n = scan.nextInt();
                    //Chooses which iteration to run depending on the integer, n
                    switch (n)
                    {
                        case (1):
                            //Prints iteration 1
                            System.out.print("f1=" + LifeLength.f1(a0));
                            break;
                        case (2):
                            //Prints iteration 2
                            System.out.print("f2=" + LifeLength.f2(a0));
                            break;
                        case (4):
                            //Prints iteration 4
                            System.out.print("f4=" + LifeLength.f4(a0));
                            break;
                        case (8):
                            //Prints iteration 8
                            System.out.print("f8=" + LifeLength.f8(a0));
                            break;
                        case (16):
                            //Prints iteration 16
                            System.out.print("f16=" + LifeLength.f16(a0));
                            break;
                        case (32):
                            //Prints iteration 32
                            System.out.print("f32=" + LifeLength.f32(a0));
                            break;
                    }
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Error: Not a whole number > 0");
            }
        } while (a0 != 0);
    }
    private static void task3()
    {
        int a0 = 0;
        int n;
        Scanner scan = new Scanner(System.in);
        do {
            try {
                //Checks for an integer to iterate with
                System.out.print("Write a whole number bigger than zero --a0-- : ");
                a0 = Math.abs(scan.nextInt());
                if (a0 != 0)
                {
                    //Checks for an integer to tell which number to return when the function iterates
                    System.out.print("Write a whole number bigger than zero --n-- : ");
                    n = scan.nextInt();

                    //Iterates
                    int x = LifeLength.iterateF(a0, n);

                    //Prints out the number asked for and which iteration it is
                    System.out.print("f"+n+"="+x);
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Error: Not a whole number > 0");
            }
        } while (a0 != 0);
    }
    private static void task4()
    {
        try {
            for (int i = 1; i < 16; i++) {
                System.out.println(LifeLength.intsToString(i, LifeLength.iterLifeLength(i)));
            }
        } catch (Exception e) {
            System.out.println("Error: Not a whole number > 0");
        }
    }
    private static void task6()
    {
        try {
            for (int i = 1; i < 16; i++) {
                System.out.println(LifeLength.intsToString(i, LifeLength.iterLifeLength(i)));
            }
            System.out.println();
            for (int i = 1; i < 16; i++)
            {
                System.out.println(LifeLength.intsToString(i, LifeLength.recLifeLength(i)));
            }

        } catch (Exception e) {
            System.out.println("Error: Not a whole number > 0");
        }
    }
}