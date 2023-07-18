public class Strings_08_ReverseWordsInString 
{
    // Naive Solution
    // Put each words in a stack and then pop it out one by one and store it into
    // an another string an return it
    static void reverseWords(char [] str, int n)
    {
        // Efficient Solution and Inplace Algorithm
        // Idea:-
        // I am Murtaza
        // I ma azatruM
        // Murtaza am I
        int start = 0;// starting index of word
        for(int end = 0; end<n; end++)
        {
            if(str[end] == ' ')
            {
                reverse(str,start,end-1); // reversing a word
                start = end +1; // Initialising start for new word
            }
        }
        reverse(str,start,n-1); // reversing the last word as we will not encounter ' ' for last word
        reverse(str, 0, n-1); // reversing the individually words reversed string
    }
    static void reverse(char [] str,int low, int high)
    {
        while(low <= high)
        {
            // Check whether we can write swap function in JAVA
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) 
    {
        String s = "Welcome to Gfg";
        int n = s.length();
        char [] str = s.toCharArray();
        System.out.println("Original String: "+s);
        reverseWords(str,n);
        String rev = new String(str);
        System.out.println("After reversing: "+ rev);
        
    }
    
}
