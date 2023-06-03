import java.util.HashMap;

public class Hashing_12_LongestSubArrayWithEqual0sAnd1s 
{
    static int maxlen0sAnd1s1(int [] arr)
    {
        // Naive Solution
        // Time Complexity = theta(n^2)
        int n = arr.length;
        int res = 0;
        for(int i=0; i<n; i++)
        {
            int ones = 0;
            int zeros = 0;
            for(int j=i; j<n; j++)
            {
                if(arr[j] == 1)
                    ones += 1;
                if(arr[j] == 0)
                    zeros += 1;
                if(ones == zeros )
                    res = Math.max(res,ones + zeros);

            }
        }
        return res;
    }
    static int maxlen0sAnd1s2(int [] arr)
    {
        // Efficient Solution
        // Time Complexity = theta(n) + theta(n)
        int n = arr.length;
        HashMap<Integer, Integer> h = new HashMap<>();
        // We will replace all zeros with -1 and then the problem will
        // become the longest subarray with sum problem
        for(int i=0; i<arr.length; i++) //----> theta(n)
        {
            if(arr[i] == 0)
                arr[i] = -1;
        }
        int prefix_sum = 0, maxLen = 0;
        for(int i=0; i<arr.length; i++)
        {
            prefix_sum += arr[i];
            if (prefix_sum == 0)
             maxLen = i+1;
             
            if(h.containsKey(prefix_sum + n) == true)
            {
                if(maxLen < i - h.get(prefix_sum + n))
                 maxLen = i - h.get(prefix_sum + n);
                
            }else h.put(prefix_sum + n, i);
        }
        return maxLen;


    }

    public static void main(String[] args)
    {
        int [] arr = {1,0,1,1,1,0,0};
        // int [] arr = {1,1,1,0,1,0};
        System.out.println(maxlen0sAnd1s1(arr));
        System.out.println(maxlen0sAnd1s2(arr));

    }
    
}
