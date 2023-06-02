import java.util.*;
public class Hashing_10_SubarrayWithGivenSum
{
    static boolean isGivenSubArray1(int [] arr, int sum)
    {
        // Naive Solution
        // Time Complexity = O(n^2)
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            int curr_sum = 0;
            for(int j = i; j<n; j++)
            {
                curr_sum += arr[j];
                if(curr_sum == sum)
                    return true;
            }
        }
        return false;
    }
    static boolean isGivenSubArray2(int [] arr, int sum)
    {
        // Efficient Solution
        // Time Complexity = O(n)
        // Space Complexity = O(n)
        HashSet<Integer> h = new HashSet<>();
        int prefix_sum =0;
        for(int x: arr)
        {
            prefix_sum += x;
            if(prefix_sum == sum)
                return true;
            if(h.contains(prefix_sum - sum))
                return true;
            h.add(prefix_sum);
        }
        return false;

    }
    public static void main(String[] args)
    {
        int [] arr = {5,8,6,13,3,-1};
        System.out.println(isGivenSubArray1(arr,22));
        System.out.println(isGivenSubArray2(arr,22));

    }
}