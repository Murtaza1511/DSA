import java.util.*;
public class Hashing_11_LongestSubArrayWithGivenSum 
{
    static int maxlen1(int [] arr, int sum)
    {
        int n = arr.length;
        int res = 0;
        for(int i=0; i<n; i++)
        {
            int curr_sum = 0;
            for(int j=i; j<n ; j++)
            {
                curr_sum += arr[j];
                if(curr_sum == sum)
                {
                    res = Math.max(res, j-i+1);
                    // Note :- j-i+1 is the subarray length
                }     

            }
        }
        return res;
    }
    static int maxlen2(int [] arr, int sum)
    {
        // Efficient Solution
        // Time Complexity = theta(n)
        // Auxiliary Space = O(n)
        HashMap<Integer, Integer> h = new HashMap<>();
        int prefix_sum = 0;
        int res = 0;
        for(int i=0; i<arr.length; i++)
        {
            prefix_sum += arr[i];
            if(h.containsKey(prefix_sum - sum))
                res =  Math.max(res ,((i) - h.get(prefix_sum - sum)));
            if(prefix_sum == sum) 
                res = Math.max(res,i+1);
            if(h.containsKey(prefix_sum) == false) // We insert key,value pair if it doesn't exists already
                h.put(prefix_sum, i);
        }
        return res;
    }
    public static void main(String[] args)
    {
        // int [] arr = {5,8,-4,-4,9,-2,2}; // sum = 0
        int [] arr = {8,3,1,5,-6,6,2,2};
        System.out.println(maxlen1(arr,4));
        System.out.println(maxlen2(arr,4));
    }
    
}
