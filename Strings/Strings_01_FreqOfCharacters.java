
// -Sequence of Characters
// -Smaller set of values i.e. Ascii about 128 values
// -Every character is given an integer value to it 
// -Java uses UTF-16 to store characters but it remains same for
// 1st 128 ASCII characters
// geeksforgeeks
// e 5
// f 3

public class Strings_01_FreqOfCharacters {
    public static void main(String[] args) 
    {
        String str = "geeksforgeeks";
        int [] count = new int [26];
        for (int i=0; i<str.length(); i++)
        {
            count[str.charAt(i)- 'a']++;
        }
        for(int i=0; i<26 ; i++)
        {
            if(count[i] > 0)
            {
                System.out.println((char)(i+'a') + " " +count[i]);
            }
        }



    }

}
