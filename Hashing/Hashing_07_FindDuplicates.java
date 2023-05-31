import java.util.*;
public class Hashing_07_FindDuplicates 
{
    static List<Integer> findDuplicates(int[] nums)
    {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i:nums)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: h.entrySet())
        {
            if(e.getValue() == 2)
            {
                l.add(e.getKey());
            }
        }
        return l;
   
    }
    public static void main(String[] args)
    {
        int arr[] = {4,2,7,3,8,2,3,1};
        System.out.println(findDuplicates(arr));

    }
    
}
