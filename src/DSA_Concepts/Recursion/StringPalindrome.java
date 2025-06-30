package DSA_Concepts.Recursion;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "MADSM";
        if(isPalindrome(str, 0))
        {
            System.out.println("The given Stirng is palindrome");
        }
        else
        {
            System.out.println("the givem string is not a palindrome");
        }

    }

    private static boolean isPalindrome(String str, int i)
    {
        int n = str.length();
        if(i >= n / 2) return true;
        if(str.charAt(i) != str.charAt(n - i - 1))
        {
            return false;
        }
        return isPalindrome(str, ++i);
    }

}
