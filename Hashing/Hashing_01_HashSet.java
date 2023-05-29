import java.util.*;
public class Hashing_01_HashSet
{
    public static void main(String [] args)
    {
        HashSet <String> h = new HashSet<String>();

        // Adding elements in HashSet
        // add() returns true if item is added and returns false if item is already present
        h.add("murtaza");
        h.add("tinwala");
        h.add("20");

        // Printing hashset
        System.out.println(h);

        // contains() is used to check whether a key is present in HashSet or not returns true if present
        System.out.println(h.contains("murtaza"));

        // We are implementing Iterator interface for iterating over HashSet
        // Note:- The order of printing of elements may differ time to time
        Iterator<String> i = h.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next() + " ");
        }

        // Returns the total items present in hashset
        System.out.println(h.size());

        // removes item from hashset
        h.remove("20");

        // Another simple way to iterate over HashSet by iterator interface
        for (String s : h)
        {
            System.out.println(s);
        }

        // isEmpty() returns true if hashset is empty and false if it is not empty
        System.out.println(h.isEmpty());

        // clear() empties the hashset
        h.clear();
        System.out.println(h.isEmpty());

    }
}