import java.util.*;

public class ReturnIndexOfWord {

    /** Constants */
    public static final String SPACE = " ";
    public static final Integer WORD_NOT_FOUND = -1;

    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc));
    }

    public static int solve(Scanner sc) {
        String phrase = sc.nextLine().toLowerCase();
        String word = sc.next().toLowerCase();

        String[] arr = phrase.split(SPACE);

        int indexToReturn = 0;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i].equals(word)) {
                return indexToReturn;
            } else {
                /** Add 1 to account for white space */
                indexToReturn += (arr[i].length() + 1);
            }
        }
        return WORD_NOT_FOUND;
    }
}
