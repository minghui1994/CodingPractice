import java.util.*;

public class LengthOfList {
    public static void main(String[] args) {

        SinglyNode node = new SinglyNode(10);
        node.next = new SinglyNode(15);
        node.next.next = new SinglyNode(20);

        System.out.println(Solution(node));
    }

    public static int Solution(SinglyNode node) {

        int length = 0;

        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}