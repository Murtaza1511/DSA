public class Strings_14_AnagramSearch
{
    final static int CHAR = 256;
    static boolean isPresent1(String txt, String pat)
    {
        // Naive Solution 
        // For every window of txt we will see whether the pat is anagram or NOT.
        // Time Complexity = O((n-m+1)*m) considering CHAR as constant
        int m = pat.length();
        int n = txt.length();
        
        for(int i=0; i<n-m; i++)
        {
            // For every window we check whether they are anagram or NOT
            if(areAnagram(txt, pat, i))
                return true;
        }
        return false;
    }
    static boolean areAnagram(String txt, String pat, int i)
    {
        int [] count = new int[CHAR];
        for(int j = 0; j<pat.length(); j++)
        {
            count[pat.charAt(j)]++;
            count[txt.charAt(i+j)]--;
        }
        for(int j=0; j<CHAR; j++)
        {
            if(count[j] != 0)
                return false;
        }
        return true;
    }
    static boolean isPresent2(String txt, String pat)
    {
        // Efficient Solution
        // This is just an optimization to our naive approach. Here we will compute
        // count array for first window and check whether they are same. If Not we
        // slide the window and compute its count array by simply removing
        // first element and adding recent element to window
        // Time Complexity = O(n*CHAR) which is linear if we consider CHAR as const
        // Count array for txt
        int [] CT = new int [CHAR];
        // Count array for pat
        int [] CP = new int[CHAR];
        for(int i=0; i<pat.length(); i++)
        {
            CT[txt.charAt(i)]++;
            CP[pat.charAt(i)]++;
        }
        // As we have already computed till window of pat so we will start from pat last index
        for(int i=pat.length(); i<txt.length(); i++)
        {
            if(areSameArray(CT,CP))
                return true;
            // Add new element to window
            CT[txt.charAt(i)]++;
            // Remove first element of window
            CT[txt.charAt(i-pat.length())]--;
        }
        return false;

    }
    static boolean areSameArray(int [] CT,int [] CP)
    {
        for(int i=0; i<CHAR; i++)
        {
            if(CT[i] != CP[i])
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) 
    {
        String str = "geeksforgeeks";
        String pat = "frog";
        System.out.println(isPresent1(str,pat));
        System.out.println(isPresent2(str,pat));
        
    }
    
}
