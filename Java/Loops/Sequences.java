import java.util.Scanner;

/**
 * We use the integers a, b, and n to create the following series:
 * 
 * (a + 2^0 * b), (a + 2^0 * b + 2^1 * b), ..., (a + 2^0 * b + 2^1 * b + ... +
 * 2^n-1 * b)
 * 
 * You are given q queries in the form of a, b, and n. For each query, print the
 * series corresponding to the given a, b, and n values as a single line of n
 * space-separated integers.
 ****************************
 * 
 * INPUT
 ****************************
 * The first line contains an integer, , denoting the number of queries. Each
 * line of the subsequent lines contains three space-separated integers
 * describing the respective ai, bi, and ni values for that query.
 ****************************
 * 
 * OUTPUT
 ****************************
 * For each query, print the corresponding series on a new line. Each series
 * must be printed in order as a single line of n space-separated integers.
 ****************************
 * 
 * INPUT CASE
 ****************************
 * 2 
 * 0 2 10 
 * 5 3 5
 ****************************
 * 
 * OUTPUT CASE
 ****************************
 * 2 6 14 30 62 126 254 510 1022 2046 
 * 8 14 26 50 98
 */
public class Sequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    public static void solve(Scanner sc) {
        int q = sc.nextInt();

        int[][] arr = new int[q][3];

        for (int i = 0; i < q; ++i) {
            for (int j = 0; j < 3; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        int row = 0;
        while (q > 0) {
            int result = arr[row][0]; // a value
            int power = 0; // the degree of power
            while (power < arr[row][2]) // n value
            {
                result += (Math.pow(2, power) * arr[row][1]); // multiply b value
                ++power;
                System.out.print(result + " ");
            }
            System.out.println();
            --q;
            ++row;
        }
    }
}