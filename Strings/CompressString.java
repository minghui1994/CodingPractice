/**
 * Given a string lowercase alphabet s, eliminate consecutive duplicate
 * characters from the string and return it.
 * 
 * That is, if a list contains repeated characters, they should be replaced with
 * a single copy of the character. The order of the elements should not be
 * changed.
 */

public class CompressString {
    public static void main(String[] args) {
        String s = "aaaaaabbbccccaaaaddf";
        System.out.println(solve(s));
    }

    public static String solve(String s) {
        StringBuilder builder = new StringBuilder();
        char current = s.charAt(0);
        builder.append(s.charAt(0));

        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == current) {
                continue;
            }
            builder.append(s.charAt(i));
            current = s.charAt(i);
        }

        return builder.toString();
    }
}
