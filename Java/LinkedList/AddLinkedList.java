import java.util.*;

/**
 * Given a singly linked list l0 and another linked list l1, each representing a
 * number with least significant digits first, return the summed linked list.
 * 
 * Note: Each value in the linked list is guaranteed to be between 0 and 9.
 */
public class AddLinkedList {
    public static void main(String[] args) {

    }
}

class Solution {
    public SinglyNode solve(SinglyNode l0, SinglyNode l1) {

        int suml0 = 0;
        int suml1 = 0;
        int total = 0;
        int multiplier = 10;
        int index = 0;
        ;

        SinglyNode headl0 = l0;
        SinglyNode headl1 = l1;
        SinglyNode result;

        while (l0 != null) {
            suml0 += (l0.val * Math.pow(multiplier, index));
            l0 = l0.next;
            ++index;
        }

        index = 0;

        while (l1 != null) {
            suml1 += (l1.val * Math.pow(multiplier, index));
            l1 = l1.next;
            ++index;
        }

        total = suml0 + suml1;

    }
}