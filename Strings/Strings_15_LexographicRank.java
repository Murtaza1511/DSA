public class Strings_15_LexographicRank 
{
    // Naive Solution
    // We will find every possible permutation of string and sort in increasing
    // order lexicographically and then see its rank
    // Time Complexity = O(n!*n)
    static final int CHAR = 256;
    static int lexRank(String str)
    {
        // Find how many strings are lexicographically smaller +1
        // For every character we will see how many characters on right of it are
        // smaller and then see how many spaces are left. We will multiply no.of 
        // characters smaller than it on right side with factorial of remaining spaces
        // NOTE:- This method works only for unique character strings but CAN be optimised
        // for repeating character strings
        // Time Complexity = O(n*CHAR)

        // res is 1 as we have to add one at last anyways
        int res = 1;
        int n = str.length();
        // Already computing factorial as we will need it in every step
        int mul = fact(n);
        int [] count = new int[CHAR];
        // Initializing count array 
        for(int i=0; i<n; i++)
            count[str.charAt(i)]++;
        // Find cumulative frequency of elements so that we can how many elements 
        // are smaller than an element in one go
        for(int i=1; i<CHAR; i++)
            count[i] += count[i-1];
        // Till n-1 as no character is on right of last character
        for(int i=0; i<n-1; i++)
        {
            // Computing n-1 factorial by fact(n)
            mul = mul/(n-i);
            // Finding smaller characters present on right of curr character
            res = res + mul * count[str.charAt(i)-1];
            // Decrementing every entry on its right by 1 as in next step this charcter
            // will be stable
            for(int j = str.charAt(i); j<CHAR; j++)
            {
                count[j]--;
            }
        }
        return res;


    }
    static int fact(int n)
    {
        int res = 1;
        for(int i=2; i<=n; i++)
        {
            res *= i;
        }
        return res;
    }
    public static void main(String[] args) 
    {
        // String str = "STRING";
        String str = "ABC";
        System.out.println(lexRank(str));
        
    }
    
}
