public class Strings_07_LeftMostNonRepeatingCharacter 
{
    static int leftMostNonRepeat1(String s)
    {
        int n = s.length();
        for(int i=0; i<n; i++)
        {
            boolean flag = true;
            for(int j=i+1; j<n; j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    flag = false;
                }
            }
            if(flag)
                return i;
        }
        return -1;
    }
    // All efficient approaches have similar logic like letfMostRepeatingCharacter problem
    public static void main(String[] args) 
    {
        String str = "geeksforgeeks";
        System.out.println(leftMostNonRepeat1(str));
        
    }
    
}
