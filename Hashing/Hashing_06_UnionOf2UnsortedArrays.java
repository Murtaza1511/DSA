import java.util.ArrayList;
import java.util.HashSet;

public class Hashing_06_UnionOf2UnsortedArrays 
{
    static int union1(int [] a, int [] b)
    {
        // Naive Solution
        // Time Complexity = O(mxm + nx(m+n))
        // Space Complexity = O(m + n)
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<a.length; i++)
        {
            boolean flag = true;
            for(int j=0; j<al.size(); j++)
            {
                if(a[i] == al.get(j))
                {
                    flag = false;
                    break;
                }
            }
            if(flag == true)
            {
                al.add(a[i]);
            }
        }
        for(int i=0; i<b.length; i++)
        {
            boolean flag = true;
            for(int j=0; j<al.size(); j++)
            {
                if(b[i] == al.get(j))
                {
                    flag = false;
                    break;
                }
            }
            if(flag == true)
            {
                al.add(b[i]);
            }
        }
        return al.size();
    }
    static int union2(int []a, int[]b)
    {
        // Efficient Solution
        // Time Complexity = theta(m + n)
        // Space Complexity = O(m + n)
        HashSet<Integer> h = new HashSet<>();
        // We can also use for-each loop here
        for(int i=0; i<a.length; i++)
        {
            h.add(a[i]);
        }
        for(int i=0; i<b.length; i++)
        {
            h.add(b[i]);
        }
        return h.size();
    }
    public static void main(String[] args)
    {
        int [] arr1 = {10,30,10};
        int [] arr2 = {5,10,5};
        System.out.println(union1(arr1,arr2));
        System.out.println(union2(arr1,arr2));

    }
}
