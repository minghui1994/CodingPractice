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
        LLNode node = new LLNode(2);

        LLNode head = node;

        node.next = new LLNode(1);
        node = node.next;

        node.next = new LLNode(4);
        node = node.next;
        
        node.next = new LLNode(1);
        node = node.next;
        
        Solution solution = new Solution();
        printLinkedList(solution.solve(head));
    }

    public static void printLinkedList(LLNode node) {
        
        while(node != null)
        {
            System.out.println(node.val);
            node = node.next;
        }
    }
    
}

class LLNode {
    int val;
    LLNode next;

    LLNode(int val) {
        this.val = val;
    }
}

class Solution {
    public LLNode solve(LLNode node) {

        LLNode head = node;

        while (node != null) {
            int i = node.val;
            LLNode current = node;

            while (i > 0 && node != null) {
                node = node.next;
                --i;
            }

            current.next = node;
        }

        return head;
    }
}
