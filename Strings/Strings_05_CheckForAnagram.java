public class Strings_05_CheckForAnagram 
{
    /*
     * 1) Naive Method:-
     * - First sort both the strings lexicographically and then equate both strings
     * Time Complexity = O(n*logn)
     * 2) Efficient Method:- 
     * - Make a 256 sized array
     * - First convert both strings to lowercase
     * - Increement array index for one string and decreement for other string
     * - Then traverse the array if any index has its value greater than 0 then
     * return false otherwise return true
     * Time Complexity = O(n + CHAR) where CHAR = 256
     * Space Complexity = O(CHAR)
     */
    static boolean isAnagram1(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;
        int [] count = new int[256]; 
        for(int i=0; i<s1.length(); i++)
        {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0; i<256; i++)
        {
            if(count[i] != 0)
                return false;
        }
        return true;
    }
    static boolean isAnagram(String s1, String s2)
    {
        // Efficient Method
        // Time Complexity = O(n)
        // Space Complexity = O(1)
        /* But NOTE this method will NOT work for all cases e.g.:- s1="ac" s2="bb" */
        int n = s1.length();
        int m = s2.length();
        int first=0;
        int second =0;
        for(int i=0; i<n; i++)
        {
            first += (int)(s1.charAt(i));
        }
        for(int i=0; i<m; i++)
        {
            second += (int)(s2.charAt(i));
        }
        return (first==second);
    }
    public static void main(String[] args) 
    {
        // Anagram of each other means strings should be permutations of each other
        // and the characters and its frequency should match
        String s1 = "listen";
        String s2 = "neilst";
        System.out.println(isAnagram(s1,s2));
        System.out.println(isAnagram1(s1,s2));

        
    }
    
}
