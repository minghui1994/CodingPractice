
/**
 * Given a list of integer, find the 2nd largest integer
 */
public class SecondLargestInteger {

    public static void main(String[] args) {
        int[] arr = { 2, 74, 234, 645, 23, 5, 235, 745, 63, 287 };

        solve(arr);
    }

    public static void solve(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int firstMaxIndex = -1;

        /** Only need to go through the array twice */
        for (int i = 0; i < 2; ++i) {
            max = Integer.MIN_VALUE;
            for (int j = 0; j < arr.length; ++j) {
                if (arr[j] > max && j != firstMaxIndex) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            if (i == 0) {
                firstMaxIndex = maxIndex;
            }
        }

        System.out.println("Largest integer is " + arr[firstMaxIndex] + ", index is " + firstMaxIndex);
        System.out.println("Second largest integer is " + max + ", index is " + maxIndex);
    }
}
