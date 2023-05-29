import java.util.HashMap;
import java.util.Map;

public class Hashing_02_HashMap 
{
    public static void main(String [] args)
    {
        HashMap <String, Integer> h = new HashMap<>();
        
        // put() is used to add (key, value) pairs to HashMap
        h.put("murtaza",10);
        h.put("mummy",20);
        h.put("bhai",30);

        // prints HashMap
        System.out.println(h);
        
        // size() returns number of key value pairs
        System.out.println(h.size());

        // As HashMap implements Map Interface so we use Map.Entry to iterate over hashMap
        for(Map.Entry<String,Integer> e : h.entrySet() )
        {
            System.out.println(e.getKey() + " "+ e.getValue());
        }
        // constainsKey() returns true if key is present and false if it is not present
        if(h.containsKey("gfg"))
            System.out.println("Yes");
        else
            System.out.println("No");

        // remove() to remove a key or value (i.e. deletes entire pair)
        h.remove("murtaza");

        if(h.containsKey("murtaza"))
            System.out.println("Yes");
        else
            System.out.println("No");

        // containsValue() check whether a value is present or not
        if(h.containsValue(20))
            System.out.println("Yes");
        else
            System.out.println("No");

        // get() is used to get corresponding value of a key

        System.out.println(h.get("mummy"));
        System.out.println(h.get("bhai"));


    }
    
}
