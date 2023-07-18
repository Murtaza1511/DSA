public class Strings_09_PatternSearching 
{
    static void patternSearchNaive(String txt, String pat)
    {
        for(int i=0; i<txt.length(); i++)
        {
            int count = 0;
            for(int j=i,k=0; j<txt.length() && k<pat.length(); j++,k++)
            {
                if(txt.charAt(j) == txt.charAt(k))
                {
                    count++;
                }

            }
            if(count == pat.length())
            {
                System.out.print(i + " ");
            }
        }
    }
    static void patternSearchNaiveGFG(String txt, String pat)
    {
        // Time Complexity = O((n-m+1) * m)
        int n = txt.length(); // text size is n
        int m = pat.length(); // pattern size is m
        for (int i=0; i<=n-m; i++) // There will be total n-m windows which we have to compare
        {
            int j;
            for( j=0; j<m; j++) // In worst case we will run m times the inner loop
                if(pat.charAt(j) != txt.charAt(i+j))
                    break;
            if(j == m)
                System.out.println(i + " ");
        }
    }
    public static void main(String[] args) 
    {
        String txt = "ABABABCD";
        String pat = "ABAB";
        patternSearchNaive(txt,pat);
        
    }
    
}
