import java.util.HashSet;

public class Hashing_03_CountDistinctElements 
{
    static int countDistinct1(int [] arr)
    {
        // Naive Solution
        // Time Complexity= O(n^2)
        // Auxiliary Space= O(1)
        // Here for every element we will check whether the same element is present on its left or not
        // and if so we won't add it in distinct element
        int n = arr.length;
        int res = 1;
        for(int i=1; i<n; i++)
        {
            boolean flag = false;
            for(int j=i-1; j>=0; j--)
            {
                if(arr[j] == arr[i])
                    flag = true;
            }
            if(flag == false)
                res++;
        }
        return res;
    }
    static int countDistinct2(int [] arr)
    {
        // Efficient Solution
        // Time Complexity= O(n)
        // Auxiliary Space = O(n) 
        HashSet<Integer> h = new HashSet<>();
        for( int i=0; i<arr.length; i++)
        {
            h.add(arr[i]);
        }

        return h.size(); 
    }
    public static void main(String[] args)
    {
        int [] arr = {1,2,2,3,1,5};
        System.out.println(countDistinct1(arr));
        System.out.println(countDistinct2(arr));
    }
    
}
