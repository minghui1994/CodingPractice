import java.util.HashMap;

public class KthLargestInteger {
    public static void main(String[] args) {
        /**
         * 743
         * 544
         * 436
         */
        int[] arr = { 34, 56, 32, 63, 544, 23, 436, 239, 64, 232, 743, 84, 212 };
        int[] arr2 = { 0, 0, 0, 0, 0, 0 };

        solve(arr2, 3);
    }

    public static void solve(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;
        int index = 0;
        
        for(int i = 0; i < k; ++i)
        {
            max = Integer.MIN_VALUE;
            for (int j = 0; j < arr.length; ++j) {
                if (arr[j] > max && !map.containsKey(j)) {
                    max = arr[j];
                    index = j;
                }
            }
            map.put(index, 1);
        }
        
        switch(k)
        {
            case 1:
                System.out.println("Largest number is " + max + ", index " + index);
                break;
            case 2:
                System.out.println("2nd largest number is " + max + ", index " + index);
                break;
            case 3:
                System.out.println("3rd largest number is " + max + ", index " + index);
                break;
            default:
                System.out.println(k + "th largest number is " + max + ", index " + index);
                break;
        }   
    }
}
