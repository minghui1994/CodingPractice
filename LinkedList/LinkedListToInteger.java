import java.util.ArrayList;
import java.util.List;

/**
 * Given a single linked list node, representing a binary number with most
 * significant digits first, return it as an integer.
 * 
 * 1 -> 0 -> 0
 * 
 * Iterate through each node and store the node inside a list.
 * Iterate the list from the back, multiply the current value with 2 x power of 0 till size()-1
 * Add up the result.
 */
public class LinkedListToInteger {
    public static void main(String[] args) {
        SinglyNode head = new SinglyNode(1);
        head.next = new SinglyNode(0);
        head.next.next = new SinglyNode(0);

        Solution solution = new Solution();
        System.out.println(solution.solve(head));

    }
}

class Solution {
    public int solve(SinglyNode node) {

        List<Integer> list = new ArrayList<>();
        int power = 0;

        while (node != null) {
            list.add(node.val);
            node = node.next;
        }

        for (int i = list.size() - 1; i >= 0; --i) {
            power += (list.get(i) * Math.pow(2, list.size() - 1 - i));
        }

        return power;
    }
}