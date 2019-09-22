
public class Ex6 {

    public static void main(String[] args)
    {
        Ex6 obj = new Ex6();

        System.out.println("Int factorials:-");
        obj.printFactorialsInt();

        System.out.println("Long factorials:-");
        obj.printFactorialsLong();
    }

    void printFactorialsInt()
    {
        int i  = 1;
        int factorial = 1;
        while (true)
        {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, factorial);
            if (Integer.MAX_VALUE/ factorial < (i+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            factorial *= i;
        }

    }

    private void printFactorialsLong()
    {
        long i  = 1L;
        long factorial = 1L;
        while (true)
        {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, factorial);
            if (Long.MAX_VALUE / factorial < (i+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            factorial *= i;
        }

    }
}
