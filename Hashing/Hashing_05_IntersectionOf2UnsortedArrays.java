import java.util.HashSet;

public class Hashing_05_IntersectionOf2UnsortedArrays 
{
    // Note:- We assume that all elements are distinct and 
    // we need to print elements in the order they are in 1st array
    static void intersection1(int[]arr1, int[]arr2)
    {
        // Naive Solution
        // Time Complexity:O(mxn)
        // For every element of arr1 we check whether same is 
        // present in arr2 and if it so we print that element
        for(int i=0; i<arr1.length; i++)
        {
            boolean flag = false;
            for(int j=0; j<arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    flag = true;
                    break;
                }    
            }
            if(flag)
                System.out.print(arr1[i] + " ");
        }
    }
    static void intersection2(int[]arr1, int [] arr2)
    {
        // Efficient Solution
        // m is size of first array and n is size of second array
        // Time Complexity: theta(m + n)
        // Space Complexity :theta(n)

        HashSet<Integer> h = new HashSet<>();
        for(int i=0; i<arr2.length; i++)
        {
            h.add(arr2[i]);
        }
        for(int i=0; i<arr1.length; i++)
        {
            if(h.contains(arr1[i]))
                System.out.print(arr1[i] +" ");
        }

    }
    public static void main(String[] args)
    {
        int[] arr1 = {10,20,96,50};
        int [] arr2 = {50,10,8,2};
        // intersection1(arr1,arr2);
        intersection2(arr1,arr2);
    }
    
}
