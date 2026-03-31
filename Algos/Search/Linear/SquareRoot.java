public class SquareRoot {
    
    public static int SqRt(int x)
    {
        for(int i = 0; i <= x; i++)
        {
            if (i*i == x)
            return i;
        }
        return -1;
    }

    public static void main(String Args[])
    {
        int n = 1000000;
        int sqrt = SqRt(n);

        if(sqrt == -1)
        System.out.println("Not a perfect square");
        else
        System.err.println("Sqt of " + n + " is = " + sqrt);
    }
}
