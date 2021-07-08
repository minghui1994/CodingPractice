public class ReverseSinglyLinkedList {

    public static void main(String[] args) {
        SinglyNode head = createLinkedList();
        System.out.print("Before Reverse: ");
        printList(head);

        SinglyNode reverseHead = reverseLinkedList(head);
        System.out.print("\nAfter Reverse: ");
        printList(reverseHead);
    }

    public static SinglyNode reverseLinkedList(SinglyNode node) {
        SinglyNode current = node;
        SinglyNode next = null;
        SinglyNode previous = null;

        // 1 -> 2 -> 3 -> 4

        while (current != null) {
            next = current.next;

            // point backward
            current.next = previous;

            previous = current;
            current = next;
        }

        return previous;
    }

    public static SinglyNode createLinkedList() {
        SinglyNode node1 = new SinglyNode(1);
        SinglyNode node2 = new SinglyNode(2);
        SinglyNode node3 = new SinglyNode(3);
        SinglyNode node4 = new SinglyNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        return node1;
    }

    public static void printList(SinglyNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}
