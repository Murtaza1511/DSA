public class Strings_13_IsStringARotation 
{   
    // Problem is to find whether s2 is a rotation of s1 or not
    static boolean isRotation1(String s1, String s2)
    {
        // Naive Solution 
        // Time Complexity = O(n^2)
        char [] str2 = s2.toCharArray();
        for(int i=0; i<s1.length()-1; i++)
        {
            s2 = new String(lrotate(str2));
            str2 = s2.toCharArray();
            if(s1.equals(s2))
                return true;
        }
        return false;

    }
    static char[] lrotate(char [] str)
    {
        int n = str.length;
        char temp = str[0];
        for(int i=1; i<n; i++)
        {
            str[i-1] = str[i];
        }
        str[n-1] = temp;
        return str;
    }
    static boolean isRotation2(String s1, String s2)
    {
        // Efficient Solution
        // Time Complexity = theta(n)
        // We can do circular search by kmp algorithm which is linear in time or more
        // simpler is to concatenate s1 with s1 and find whether s2 is present in 
        // concatenated string by using library function
        if(s1.length() != s2.length()) return false;
        else return ((s1+s1).indexOf(s2) >= 0);
             
    }
    public static void main(String[] args) 
    {
        String s1 = "ABCD";
        String s2 = "DABC";
        System.out.println(isRotation1(s1,s2));
        System.out.println(isRotation2(s1,s2));

    }
    
}
