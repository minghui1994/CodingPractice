import java.util.HashMap;
import java.util.Set;

/**
 * Given two strings s0 and s1, return whether they are anagrams of each other.
 */
public class AnagramChecks {

    public static void main(String[] args) {
        String s0 = "silent";
        String s1 = "listen";

        System.out.println(solve(s0, s1));
    }

    public static boolean solve(String s0, String s1) {

        if (s0.length() != s1.length()) {
            return false;
        }

        HashMap<Character, Integer> mapS0 = new HashMap<>();
        HashMap<Character, Integer> mapS1 = new HashMap<>();

        for (int i = 0; i < s0.length(); ++i) {
            if (mapS0.containsKey(s0.charAt(i))) {
                mapS0.put(s0.charAt(i), mapS0.get(s0.charAt(i)) + 1);
            } else {
                mapS0.put(s0.charAt(i), 1);
            }

            if (mapS1.containsKey(s1.charAt(i))) {
                mapS1.put(s1.charAt(i), mapS1.get(s1.charAt(i)) + 1);
            } else {
                mapS1.put(s1.charAt(i), 1);
            }
        }

        Set<Character> keySet = mapS0.keySet();

        for (Character key : keySet) {
            if (!mapS1.containsKey(key)) {
                return false;
            }
            if (!mapS0.get(key).equals(mapS1.get(key))) {
                return false;
            }
        }

        return true;
    }
}
