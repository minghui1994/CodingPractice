public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 7, 6, 9, 8, 10, 15, 14 };
        long start = System.currentTimeMillis();
        prt("Before Sorting");
        printArr(arr);
        prt("");

        sort(arr);
        prt("After sorting");
        printArr(arr);

        long end = System.currentTimeMillis();
        prt("\nTime taken: " + (end - start) + "ms");
    }

    public static void fasterSort(int[] arr) {
        boolean swapFlag = false;

        for (int i = 0; i < arr.length; ++i) {
            swapFlag = false;
            for (int j = i + 1; j < arr.length - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapFlag = true;
                }
            }
            // When there is no swap, means arr is sorted
            if (!swapFlag) {
                break;
            }
        }
    }

    // { 1, 5, 4, 7, 6, 9, 8, 10, 15, 14 }
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr.length - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void prt(String str) {
        System.out.println(str);
    }
}