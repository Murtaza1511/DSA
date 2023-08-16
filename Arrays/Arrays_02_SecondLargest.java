package Arrays;

public class Arrays_02_SecondLargest 
{
    static int getSecLargest1(int [] arr)
    {
        // Naive Method
        // Time Complexity = O(n^2)
        int n = arr.length;
        int largest = getLargest(arr);
        int sec_largest = -1;
        for(int i=0; i<n; i++)
        {
            if(arr[i] != arr[largest])
            {
                if(sec_largest == -1)
                {
                    sec_largest = i;
                }
                else if(arr[i] > arr[sec_largest])
                {
                    sec_largest = i;
                }
            }
        }
        return sec_largest;

    }
    static int getLargest(int []arr)
    {
        // Efficient Solution
        // Time Complexity = O(n)
        int n = arr.length;
        int largest = 0;
        for(int i=1; i<n; i++)
        {
            if(arr[i] > arr[largest])
            {
                largest = i;
            }
        }
        return largest;
    }
    static int getSecLargest2(int [] arr)
    {
        int n = arr.length;
        int sec_largest = -1;
        int largest = 0;
        for(int i=1; i<n; i++)
        {
            if(arr[i] > arr[largest])
            {
                sec_largest = largest;
                largest = i;
            }
            if(arr[i] != arr[largest])
            {
                if(sec_largest == -1)
                {
                    sec_largest = i;
                }
                else if(arr[i] > arr[sec_largest])
                {
                    sec_largest = i;
                }
            }
        }
        return sec_largest;

    }

    public static void main(String[] args)
    {
        int [] arr = {5,7,10,20};
        System.out.println(getSecLargest1(arr));
        System.out.println(getSecLargest2(arr));
    }
    
}
