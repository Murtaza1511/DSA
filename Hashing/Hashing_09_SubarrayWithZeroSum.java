import java.util.HashSet;

public class Hashing_09_SubarrayWithZeroSum 
{
    static boolean is0SubArray1(int [] arr)
    {
        // Naive Solution
        // Time Complexity = O(n^2)
        // Note:- Subarray is a small array of same array with continguous elements
        // Eg:- arr =[10,20,30] then subarray = [10],[10,20],[20],[30],[20,30],[10,20,30]
        // but NOT [10,30]
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            int sum = arr[i];
            if(sum == 0)
                return true;
            for(int j=i+1; j<n; j++)
            {
                sum = sum + arr[j];
                if(sum == 0)
                {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean is0SubArray2(int [] arr)
    {
        // Efficient Solution
        // Time Complexity = O(n)
        // Space Complexity = O(n)
        // Here we will use prefix sum and hashing to solve this problem efficiently
        // If we get prefix sum equal to any element in the hashset then it means that
        // there is a subarray whose sum is zero, where prefix_sum are elements of HashSet
        int prefix_sum = 0;
        HashSet<Integer> h = new HashSet<>();
        for(int i=0; i<arr.length; i++)
        {
            prefix_sum += arr[i];
            if(h.contains(prefix_sum))
            {
                return true;
            }
            if(prefix_sum == 0)
            {
                return true;
            }
            h.add(prefix_sum);
        }
        return false;

    }
    public static void main(String[] args)
    {
        int [] arr = {1,4,13,-3,-10,5};
        System.out.println(is0SubArray1(arr));
        System.out.println(is0SubArray2(arr));

    }
    
}
