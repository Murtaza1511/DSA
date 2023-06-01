import java.util.*;
public class Hashing_08_PairWithGivenSum 
{
    static boolean isPair1(int [] arr, int sum)
    {
        // Naive Solution
        // Time Complexity = O(n^2)
        int n = arr.length; 
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++ )
            {
                if((arr[i] + arr[j]) == sum)
                {
                    return true;
                }
            }
        }
        return false;
    } 
    static boolean isPair2(int [] arr, int sum)
    {
        // Time Complexity = O(n)
        // Space Complexity = O(n)
        // Some people would think that first we will add all elements in hashtable 
        // and then check whether for every element of an array sum - arr[i] is present 
        // but it won't work instead we have to check that sum - arr[i] element is present 
        // before inserting that element to HashSet 
        HashSet<Integer> h = new HashSet<>();
        for(int x : arr)
        {
            if(h.contains(sum - x))
            {
                return true;
            }
            else
            {
                h.add(x);
            }
        }
        return false;

    }

    public static void main(String[] args)
    {
        int arr[] = {3,2,8,13,-8};
        System.out.println(isPair1(arr,5));
        System.out.println(isPair2(arr,5));

    }
    
}
