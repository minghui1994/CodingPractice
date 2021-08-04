import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class OrderedHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Hello", 1);
        map.put("World", 2);
        map.put("I", 3);
        map.put("Am", 4);
        map.put("Here", 5);
        map.put("To", 6);
        map.put("Learn", 7);
        map.put("Java", 8);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Hello", 1);
        map2.put("World", 2);
        map2.put("I", 3);
        map2.put("Am", 4);
        map2.put("Here", 5);
        map2.put("To", 6);
        map2.put("Learn", 7);
        map2.put("Java", 8);

        Set<String> set = map.keySet();
        Set<String> set2 = map2.keySet();

        System.out.println("Linked Hash Map");
        for(String key: set)
        {
            System.out.println(key);
        }

        System.out.println("\n\nHash Map");
        for(String key: set2)
        {
            System.out.println(key);
        }
    }
}