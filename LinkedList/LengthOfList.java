import java.util.*;

public class LengthOfList {
    public static void main(String[] args) {

        Node node = new Node(10);
        node.next = new Node(15);
        node.next.next = new Node(20);

        System.out.println(Solution(node));
    }
    
    public static int Solution(Node node) {
        
        int length = 0;

        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}