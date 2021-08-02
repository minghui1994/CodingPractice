import java.util.Scanner;

/**
 * Given a n * n matrix, print it in a spiral format.
 * 
 * n = 3
 * 
 * 1    2    3
 * 4    5    6
 * 7    8    9
 * 
 * 1    2   3   6   9   8   7   4   5
 */
public class PrintCircular {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        /**
         * 1    2    3    4
         * 5    6    7    8
         * 9    10   11   12
         * 13   14   15   16
         */
        int n = 4;
        int[][] arr = { 
                { 1, 2, 3, 4 }, 
                { 5, 6, 7, 8 }, 
                { 9, 10, 11, 12 }, 
                { 13, 14, 15, 16 } 
        };
        // fillArray(sc, arr, n);
        circular(arr, n);

    }

    public static void circular(int[][] arr, int n) {
        int row = 0, col = 0;
        int totalSteps = n * n;
        int step = 0;
        int upperEdge = n, lowerEdge = 0; // edge
        int[] result = new int[n * n];
        int direction = 1; // 1 = right, 2 = down, 3 = left, 4 = up
        int index = 0;

        /**
         * [ [1, 2, 3], [4, 5, 6], [7, 8, 9] ]
         */
        result[0] = arr[0][0];
        while (step != totalSteps) {
            switch (direction) {
                case 1:
                    result[index] = arr[row][col];
                    ++col;
                    break;
                case 2:
                    result[index] = arr[row][col];
                    ++row;
                    break;
                case 3:
                    result[index] = arr[row][col];
                    --col;
                    break;
                case 4:
                    result[index] = arr[row][col];
                    --row;
                    break;
            }
            ++step;
            ++index;
            if (direction == 1 && col == upperEdge) {
                ++direction;
                col = upperEdge - 1;
                ++row;
            } else if (direction == 2 && row == upperEdge) {
                ++direction;
                row = upperEdge - 1;
                --col;
            } else if (direction == 3 && col < lowerEdge) {
                ++direction;
                col = lowerEdge;
                --row;
            } else if (direction == 4 && row == lowerEdge) {
                direction = 1;
                row = lowerEdge + 1;
                ++lowerEdge;
                --upperEdge;
                ++col;
            }
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static void fillArray(Scanner sc, int[][] arr, int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}