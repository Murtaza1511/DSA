import java.util.Arrays;

public class Strings_16_LongestSubstringWithDistChar 
{
    static int longestDistinct1(String str)
    {
        // Naive Solution 
        // Time Complexity = O(n^3)

        int n = str.length();
        int res = 0;
        for(int i=0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                // Check whether the particular substring has distinct elements or not
                if(areDistinct(str,i,j))
                    res = Math.max(res,j-i+1);
            }
        }
        return res;
    }
    static boolean areDistinct(String s, int i, int j)
    {
        boolean [] visited = new boolean[256];
        for(int k=i; k<=j; k++)
        {
            if(visited[s.charAt(k)])
                return false;
            visited[s.charAt(k)] = true;
        }
        return true;
    }
    static int longestDistinct2(String str)
    {
        // Naive Solution
        // Time Complexity = O(n^2)
        int n = str.length();
        int res = 0;
        
        for(int i=0; i<n; i++)
        {
            boolean [] visited = new boolean[256];
            for(int j=0; j<n; j++)
            {
                // Here we will simply check whether the entry is already true
                // means that this char is NOT distinct and we will break
                if(visited[str.charAt(j)])
                    break;
                else
                {
                    res = Math.max(res,j-i+1);
                    visited[str.charAt(j)] = true;
                }
            }
        }
        return res;
    }
    static int longestDistinct3(String str)
    {
        // Efficient Solution
        // We will use maxEnd(j-1) to compute maxEnd(j). maxEnd(j-1) is the max substring
        // possible with end index as j-1. If we have this character in b/w in the 
        // maxEnd(j-1) then maxEnd(j) will be from prev index of character at j till j
        // otherwise maxEnd(j-1) +1
        // Time Complexity = O(n)
        
        int n = str.length();
        int res =0;
        int i=0;
        int [] prev = new int [256];
        Arrays.fill(prev,-1);
        for(int j=0; j<n; j++)
        {
            // Find the latest index of str[j] as i is starting index for previous 
            //iteration maxEnd
            i = Math.max(i,prev[str.charAt(j)]+1);
            int maxEnd = j-i+1;
            res = Math.max(res,maxEnd);
            prev[str.charAt(j)] = j;
        }
        return res;
    }

    public static void main(String[] args) 
    {
        String str = "abcdabc";
        System.out.println(longestDistinct1(str));
        System.out.println(longestDistinct2(str));
        System.out.println(longestDistinct3(str));
        
        
    }
    
}
