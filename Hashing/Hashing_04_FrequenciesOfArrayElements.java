import java.util.*;

public class Hashing_04_FrequenciesOfArrayElements 
{
    static void prinFreq1(int [] arr)
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            // Naive Solution
            // Time Complexity = O(n^2)
            // Space Complexity = O(1)
            boolean flag = false;
            // Check if element was already seen
            for(int k=0; k<i; k++)
            {
                if(arr[i] == arr[k])
                {
                    flag = true;
                    break;
                }
            }
            // If already seen before then ignore it and don't find the frequency as it had been already found out
            if(flag == true)
                continue;
            
            // If it had been not seen before then count its frequency and print it
            int freq = 0;
            for(int j=i; j<n; j++)
            {
                if(arr[j]  == arr[i])
                    freq ++;
            }
            System.out.println(arr[i] + " " + freq);
        }
    }
    static void printFreq2(int [] arr)
    {
        // Efficient Solution
        // Time Complexity = O(n)
        // Auxiliary Space = O(n)
        HashMap<Integer,Integer> h = new HashMap<>();
        // for(int i=0; i<n ;i++)
        // {
        //     // if(h.containsKey(arr[i]))
        //     // {
        //     //     int newV = h.get(arr[i]) + 1;
        //     //     h.put(arr[i],newV);
        //     // }
        //     // if(h.containsKey(arr[i]) == false)
        //     // {
        //     //     h.put(arr[i],1);
        //     // }

            
        // }
        // System.out.println(h);

        for(int x : arr)
        {
            h.put(x, h.getOrDefault(x, 0)+1);
        }
        for(Map.Entry<Integer,Integer> e : h.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
    public static void main(String[] args)
    {
        int[] arr = {10,20,50,10,30,60};
        prinFreq1(arr);
        printFreq2(arr);
    }
    
}
