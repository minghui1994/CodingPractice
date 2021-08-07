public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 6, 5, 8, 7, 9, 10, 15, 14, 12, 11 };
        prtln("Before");
        printArr(arr);

        sort(arr);
        prtln("After");
        printArr(arr);
    }

    public static void sort(int[] arr) {

        // { 1, 4, 3, 6, 5, 8, 7, 9, 10, 15, 14, 12, 11 }
        for (int i = 1; i < arr.length; ++i) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = current;
        }
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            prt(i + ", ");
        }
        prtln("");
    }

    public static void prt(String str) {
        System.out.print(str);
    }

    public static void prtln(String str) {
        System.out.println(str);
    }
}