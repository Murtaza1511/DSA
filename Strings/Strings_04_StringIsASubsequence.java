public class Strings_04_StringIsASubsequence
{
    // Naive Solution
    // Time Complexity = O(2^n*n)
    // Exhaustive Search
    static boolean isStringSubsequence(String s1, String s2)
    {
        // Efficient Solution
        // Time Complexity = O(n+m) because it may happen that m is greater than n 
        // but in that case we can keep a check that if(n<m) return false;
        // Space Complexity = O(1)
        int j=0;
        int n = s1.length();
        int m = s2.length();
        for(int i=0; i<n && j<m; i++)
        {
            if(s1.charAt(i) == s2.charAt(j))
            {
                j++;
            }
        }
        return (j==m);

    }
    static boolean isStringSubsequenceRec(String s1,String s2,int n, int m)
    {
        // Recursive Solution
        // Time Complexity = O(m+n)
        // Space Complexity = O(m+n)
        if(m == 0)
            return true;
        if(n == 0)
            return false;
        if(s1.charAt(n-1) == s1.charAt(m-1))
            return isStringSubsequenceRec(s1, s2, n-1, m-1);
        else
            return isStringSubsequenceRec(s1, s2, n-1, m);
    }
    public static void main(String [] args)
    {
        String str = "ABCD";
        System.out.println(isStringSubsequence(str, "AC"));
        System.out.println(isStringSubsequenceRec(str, "AD", 4, 2));
    }
}