import java.util.*;

public class SwapCharacterToEqualizeString {
    public static void main(String[] args)
    {
        solve("abbb", "abcd");
    }

    public static boolean solve(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        Hashtable<Character, Integer> tableS = new Hashtable<>();
        Hashtable<Character, Integer> tableT = new Hashtable<>();

        for(int i = 0; i < s.length(); ++i)
        {
            if(tableS.containsKey(s.charAt(i))){
                tableS.put(s.charAt(i), tableS.get(s.charAt(i)) + 1);
            } else 
            {
                tableS.put(s.charAt(i), 1);
            }

            if(tableT.containsKey(t.charAt(i))){
                tableT.put(t.charAt(i), tableT.get(t.charAt(i)) + 1);
            } else 
            {
                tableT.put(t.charAt(i), 1);
            }
        }

        Set<Character> entrySet = tableS.keySet();
        
        for(Character key: entrySet)
        {
            System.out.println(key);
        }

        return true;
    }
}