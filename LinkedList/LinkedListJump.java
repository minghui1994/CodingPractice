import java.util.*;

/**
 * You are given a singly linked list node containing positive integers. Return
 * the same linked list where every node's next points to the node val nodes
 * ahead. If there's no such node, next should point to null.
 * 
 * Input: node = [2, 1, 4, 1], Output: [2, 4]
 */
public class LinkedListJump {

    public static void main(String[] args)
    {
        SinglyNode node = new SinglyNode(2);

        SinglyNode head = node;

        node.next = new SinglyNode(1);
        node = node.next;

        node.next = new SinglyNode(4);
        node = node.next;
        
        node.next = new SinglyNode(1);
        node = node.next;
        
        Solution solution = new Solution();
        printLinkedList(solution.solve(head));
    }

    public static void printLinkedList(SinglyNode node) {
        
        while(node != null)
        {
            System.out.println(node.val);
            node = node.next;
        }
    }
    
}

class Solution {
    public SinglyNode solve(SinglyNode node) {

        SinglyNode head = node;

        while (node != null) {
            int i = node.val;
            SinglyNode current = node;

            while (i > 0 && node != null) {
                node = node.next;
                --i;
            }

            current.next = node;
        }

        return head;
    }
}
