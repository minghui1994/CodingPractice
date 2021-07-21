/**
 * You’re given a string s containing letters of three types, R, B, and ..
 * 
 * R represents your current position, B represents a blocked position, and .
 * represents an empty position. In one step, you can move to any adjacent
 * position to your current position, as long as it is empty. Can you reach
 * either the leftmost position or the rightmost position?
 * 
 * Return true if you can reach either the leftmost or the rightmost position,
 * or false if you cannot.
 */
public class RookieMistake {
    public static void main(String[] args) {
        String s = "......B....R..............";
        System.out.println(solve(s));
    }

    public static boolean solve(String s) {

        int pos = currentPosition(s);

        return !s.substring(0, pos).contains("B") || !s.substring(pos, s.length()).contains("B");
    }

    public static int currentPosition(String s) {
        int index = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'R') {
                index = i;
                break;
            }
        }

        return index;
    }
}
