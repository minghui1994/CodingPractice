public class ReverseWords {
    public static void main(String[] args)
    {
        String sentence = "hello there my friend";
        System.out.println(solve(sentence));
    }

    public static String solve(String sentence) {

        String[] arr = sentence.split(" ");
        String reversed = "";
        for (int i = arr.length - 1; i >= 0; --i) {
            reversed += arr[i];// reverseString(arr[i]);
            if (i != 0) {
                reversed += " ";
            }
        }

        return reversed;
    }
}
