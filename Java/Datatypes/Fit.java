import java.util.*;

/**
 * Java has 8 primitive data types; char, boolean, byte, short, int, long,
 * float, and double. For this exercise, we'll work with the primitives used to
 * hold integer values (byte, short, int, and long):
 * 
 * A byte is an 8-bit signed integer. A short is a 16-bit signed integer. An int
 * is a 32-bit signed integer. A long is a 64-bit signed integer. Given an input
 * integer, you must determine which primitive data types are capable of
 * properly storing that input.
 * 
 * 5 
 * -150 
 * 150000 
 * 1500000000 
 * 213333333333333333333333333333333333
 * -100000000000000
 * 
 * -150 can be fitted in: 
 * * short 
 * * int 
 * * long 
 * 150000 can be fitted in: 
 * * int 
 * * long
 * 1500000000 can be fitted in: 
 * * int 
 * * long 
 * 213333333333333333333333333333333333 can't be fitted anywhere. 
 * -100000000000000 can be fitted in: 
 * * long
 */
public class Fit {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[T];

        for (int i = 0; i < T; ++i) {
            String num = sc.nextLine();
            arr[i] = num;
        }

        for (int i = 0; i < T; ++i) {
            String success = arr[i] + " can be fitted in:\n";
            int num_failure = 0;
            try {
                Byte.parseByte(arr[i]);
                success += "* byte\n";
            } catch (Exception e) {
                ++num_failure;
            }
            try {
                Short.parseShort(arr[i]);
                success += "* short\n";
            } catch (Exception e) {
                ++num_failure;
            }

            try {
                Integer.parseInt(arr[i]);
                success += "* int\n";
            } catch (Exception e) {
                ++num_failure;
            }

            try {
                Long.parseLong(arr[i]);
                success += "* long\n";
            } catch (Exception e) {
                ++num_failure;
            }

            if (num_failure == 4) {
                System.out.println(arr[i] + " can't be fitted anywhere.");
            } else {
                System.out.print(success);
            }
        }
        sc.close();
    }
}