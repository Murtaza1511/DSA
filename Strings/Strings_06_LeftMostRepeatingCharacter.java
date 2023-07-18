import java.util.Arrays;

public class Strings_06_LeftMostRepeatingCharacter 
{
    static final int CHAR = 256;
    static int leftMost1(String str)
    {
        // Time Complexity = O(n^2)
        // Here we simply check for each character that whether the same character is there on its right
        // if YES then we return that index otherwise if we have checked for every characters and all
        // elements are UNIQUE then we return -1
        int n = str.length();
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(str.charAt(i) == str.charAt(j))
                    return i;
            }
        }
        return -1;
    }
    static int leftMost2(String str)
    {
        // Better Approach
        // Time Complexity = O(n)
        /*
         * We will maintain a frequency table for all characters and then we traverse that count array
         * and if count[i] > 1 then we will return i
         */
        int n = str.length();
        int [] count = new int[CHAR];
        for(int i=0; i<n; i++)
        {
            count[str.charAt(i)]++;
        }
        for(int i=0; i<n; i++)
        {
            if(count[str.charAt(i)] > 1) // We want first repeating character of str
                return i;               // so count[str.charAt(i)] and NOT count[i]
        }
        return -1;
    }
    static int leftMost3(String str)
    {
        // Efficient Solution
        // We will maintain a first index occurence of an element and we will get 
        // answer in one traversal
        int []fIndex = new int[CHAR];
        Arrays.fill(fIndex,-1);
        int res = Integer.MAX_VALUE;
        for(int i=0; i<str.length(); i++)
        {
            int fi = fIndex[str.charAt(i)];
            if(fi == -1)
                fIndex[str.charAt(i)] = i;
            else
                res = Math.min(res,fi);
        }
        return (res == Integer.MAX_VALUE)? -1:res;
    }
    static int leftMost4(String s)
    {
        // Efficient Solution
        // We will maintain a boolean visited array , we will mark true when we visit
        // a character and if index is already true then we will update the result
        // Time Complexity = O(n)
        int res = -1;
        int n = s.length();
        boolean [] visited = new boolean [CHAR];
        for(int i=n-1; i>=0; i--)
        {
            if(visited[s.charAt(i)])
                res = i;
            else
                visited[s.charAt(i)] = true;
        }
        return res;
    }

    public static void main(String[] args) 
    {
        String str = "geeksforgeeks";
        System.out.println(leftMost1(str));
        System.out.println(leftMost2(str));
        System.out.println(leftMost3(str));
        System.out.println(leftMost4(str));
        
    }
    
}
