package Strings;

public class Strings_03_PalindromeStringOrNot 
{
    static boolean isPalindrome1(String str)
    {
        // Naive Method
        // Time Complexity = theta(n)
        // Auxiliary Space = theta(n)

        // My method
        // String rev = "";
        // int n = str.length();
        // for(int i=n-1; i>=0 ; i--)
        // {
        //     rev = rev + str.charAt(i);
        // }
        // if(str.equals(rev) == true)
        //     return true;
        // else 
        //     return false;

        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        return str.equals(str1.toString());
    }
    static boolean isPalindrome2(String str)
    {
        // Efficient Method
        // Time Complexity = O(n)
        int n = str.length();
        int low = 0;
        int high = n-1;
        while(low < high)
        {
            if(str.charAt(low) != str.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        String str = "CABBC";
        System.out.println(isPalindrome1(str));
        System.out.println(isPalindrome2(str));
        
        
    }
    
}
