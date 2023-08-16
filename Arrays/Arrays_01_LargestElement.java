package Arrays;
public class Arrays_01_LargestElement 
{
    static int getLargest1(int [] arr)
    {
        // Naive Solution
        // Time Complexity = O(n^2)
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            boolean flag = true;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j] > arr[i])
                {
                    flag = false;
                    break;
                }
            }
            if(flag== true)
            {
                return i;
            }
        }
        return -1;
    }
    static int getLargest2(int []arr)
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
    public static void main(String[] args) 
    {
        int arr[] = {10,5,20,8};
        System.out.println(getLargest1(arr));
        System.out.println(getLargest2(arr));
        
    }
    
}
