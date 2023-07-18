public class Strings_10_PatternSearchingforDistinctCharsInPattern 
{
    static void patternSearchNaiveForDistPat(String txt, String pat)
    {
        int n = txt.length();
        int m = pat.length();
        int k=0;
        int first = -1;
        int count =0;
        for(int i=0; i<n; i++)
        {
            if(k==0 && txt.charAt(i) == pat.charAt(k))
            {
                first = i;
                count++;
                k++;
            }
            else if(txt.charAt(i) == pat.charAt(k))
            {
                count++;
                k++;
            }
            else
            {
                k=0;
                count=0;
            }
            if(count == m && ((i-first)+1) == m)
            {
                System.out.println(first);
                first = -1;
                k=0;
                count =0;
            }


        }
    }
    static void patternSearchNaiveForDistPatGFG(String txt, String pat)
    {
        // Time Complexity = theta(n)
        // Here we use the fact that pat elements are distinct so if some characters
        // had already matched with the txt string then no need to slide
        // the window by 1 index instead shift it by j index so that that many 
        // iterations are saved
        int n = txt.length();
        int m = pat.length();
        for(int i=0; i<=n-m;)
        {
            int j = 0;
            for( j =0; j<m; j++)
            {
                if(txt.charAt(i+j) != pat.charAt(j))
                    break;
            }
            if(j == m)
                System.out.println(i+" ");
            if(j == 0) // If pat not matched from 1st character itself
                i++;
            else
                i = (i+j);
        }
    }
    public static void main(String[] args) 
    {
        String txt = "ABCDABCDABCD";
        String pat = "ABCD";
        patternSearchNaiveForDistPat(txt,pat);
        patternSearchNaiveForDistPatGFG(txt, pat);
    }
    
}
