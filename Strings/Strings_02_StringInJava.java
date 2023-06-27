package Strings;

public class Strings_02_StringInJava 
{
    public static void main(String[] args) 
    {
        // StringBuilder and StringBuffer are mutable and StringBuilder is Not thread safe
        // while StringBuffer is thread safe and is used in multithreaded apps while
        // it has overhead so used only where necessary 
        // Creates a string literal
        String str = "geeks";

        // Returns the number of 
        // characters in the String. 
        System.out.println(str.length());
        
        // Returns the character at ith index. 
        System.out.println(str.charAt(3)); 
        // Note:- We can't do str.charAt(3) = 'i'
                           
        // Return the substring from the 
        // ith  index character 
        // to end of string 
        System.out.println(str.substring(2)); 
  
        // Returns the substring from i to j-1 index. 
        System.out.println(str.substring(2,5)); 

        // Creating two string literals
        String s1 = "geeksforgeeks";
        String s2 = "geeks";
        
        // Returns the first occurrence of
        // s2 in s1 after index 1
        System.out.println(s1.indexOf(s2));

         // Creating two string literals
        String str1 = "geeksforgeeks";
        String str2 = "for";
         
        int res = str1.compareTo(str2);
         
        if(res == 0)
             System.out.println("Same");
         
        if(res > 0)
             System.out.println("s1 is Greater");
             
        if(res < 0)
             System.out.println("s1 is Smaller");

        // Creating two string literals
        String s3 = "geeksforgeeks";
        String s4 = "geeksforgeeks";
        
        // Whether s3 equal to s4
        System.out.println(s3.equals(s4));
        s2 = "geeks";
        
        // Whether s2 is present in s3 or not
        // true
        System.out.println(s3.contains(s2));

        // Creating two string literals
        String n1 = "geeks";
        String n2 = "geeks";
        
        // Checking if both point to the
        // same object or not
        if(n1 == n2)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        // Creating a string using 
        // new operator
        String n3 = new String("geeks");
        
        // Checking if both point to the
        // same object or not
        if(n1 == n3)
            System.out.println("Yes");
        else
            System.out.println("No");

         // Creating two string literals
         String z1 = "geeks";
         String z2 = z1;
         
         // Creates a new object "geeksforgeeks"
         // Now z1 points to this new string
         z1 = z1 + "forgeeks";
         // or
         // z1 = z1.concat("forgeeks");
         
         System.out.println(z1);
         
         // Since z2 is still pointing 
         // to initial "geeks"
         // and z1 is pointing to a new 
         // object "geeksforgeeks"
         System.out.println(z1 == z2);



    
        
    }

    
}
