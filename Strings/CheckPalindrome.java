/**
    Given a string s, return whether it is a palindrome.
 */
public class CheckPalindrome{
    public static void main(String[] args)
    {
        String str = "racecar";
        System.out.println(solve(str));
    }

    public static boolean solve(String s) {
        StringBuilder builder = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; --i)
        {
            builder.append(s.charAt(i));
        }
        return builder.toString().equals(s);
    }
}