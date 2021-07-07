public class NodeDeletion {

    public static void main(String[] args) {

        LLNode head = new LLNode(10);
        LLNode node = head;

        node.next = new LLNode(20);

        node.next.next = new LLNode(30);

        // printNode(head);

        printNode(solve(head, 20));
    }

    public static void printNode(LLNode node) {

        int count = 0;
        while (node != null) {
            System.out.println("Node " + count + ": " + node.val);
            ++count;
            node = node.next;
        }
    }

    public static LLNode solve(LLNode node, int target) {

        LLNode previous = node;
        LLNode head = node;

        // also need check if previous == head
        while (node != null) {
            if (node.val == target) {
                if (node == head) {
                    node = node.next;
                    previous = node;
                    head = node;
                } else {
                    previous.next = node.next;
                    node = node.next;
                }
                continue;
            }
            previous = node;
            node = node.next;
        }
        return head;
    }
}

class LLNode {
    int val;
    LLNode next;

    LLNode(int val) {
        this.val = val;
    }
}
