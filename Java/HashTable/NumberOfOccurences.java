import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NumberOfOccurences {
    public static void main(String[] args) {
        String[] categories = { "Electronics", "Fashion", "Hobbies", "Electronics", "Food", "Hobbies", "Gaming",
                "Sports", "Food", "Gaming", "Electronics" };

        
        System.out.println("Key Set Method");
        solveKeySet(categories);

        System.out.println("\n\nIterator Method");
        solveIterator(categories);

    }

    /**
     * Iterate the hash map using Iterator
     */
    public static void solveIterator(String[] categories)
    {
        HashMap<String, Integer> occurences = new HashMap<>();

        for (int i = 0; i < categories.length; ++i) {
            if (occurences.containsKey(categories[i].toLowerCase())) {
                occurences.put(categories[i].toLowerCase(), occurences.get(categories[i].toLowerCase()) + 1);
            } else {
                occurences.put(categories[i].toLowerCase(), 1);
            }
        }

        Iterator it = occurences.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }

    /**
     * Iterate the hash map using key set
     */
    public static void solveKeySet(String[] categories) {
        HashMap<String, Integer> occurences = new HashMap<>();

        for (int i = 0; i < categories.length; ++i) {
            if (occurences.containsKey(categories[i].toLowerCase())) {
                occurences.put(categories[i].toLowerCase(), occurences.get(categories[i].toLowerCase()) + 1);
            } else {
                occurences.put(categories[i].toLowerCase(), 1);
            }
        }

        Set<String> keys = occurences.keySet();

        for(String key: keys)
        {
            System.out.println(key + ": " + occurences.get(key));
        }
    }
}
