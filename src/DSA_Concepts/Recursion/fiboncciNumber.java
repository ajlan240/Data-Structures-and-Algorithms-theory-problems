package DSA_Concepts.Recursion;

public class fiboncciNumber
{
    public static void main(String[] args)
    {
        System.out.println(fiboNum(6));
    }

    private static int fiboNum(int n) {
        if(n <= 1)
        {
            return n;
        }
        return fiboNum(n - 1) + fiboNum(n - 2);
    }

}
