package DSA_Concepts.Recursion;

public class BasicQnsOfRecursion
{
    public static void main(String[] args)
    {
//        printName(5);
//        printLinear(10);
//        printLinearRev(10);
        System.out.println(sumOfNterms(10));
    }
    // 1. print name 'N' times recursion
    static void printName(int size)
    {
        System.out.println("Ajlan");

        if(size < 1)
        {
            return;
        }
        printName(--size);
    }

    // 2. Print Linearly from 1 -> 'N'
    static void printLinear(int size)
    {
        if(size > 1)
            printLinear(size - 1);
        System.out.print(size + ", ");
    }

    // 3. Print Linearly from N -> '1'
    static void printLinearRev(int size)
    {   System.out.print(size + ", ");
        if(size > 1)
            printLinearRev(size - 1);

    }
    // 4. Sum of 'N' terms of Numbers
    static int sumOfNterms(int n)
    {
        if(n < 1)
            return 0;
        return n + sumOfNterms(n - 1);

    }



}
