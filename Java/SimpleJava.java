import java.util.Scanner;

public class SimpleJava {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char ch = sc.next().charAt(0);

        System.out.println("String: " + str);
        System.out.println("Char: " + ch);
    }
}
