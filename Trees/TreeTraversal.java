public class TreeTraversal {

    public static void main(String[] args) {
        Node data = createData();
        // preOrder(data);
        // postOrder(data);
        inOrder(data);
    }

    public static void preOrder(Node n) {
        /** a b c e f d g */

        if (n == null) {
            return;
        }

        System.out.println(n.value + " ");
        preOrder(n.left);
        preOrder(n.right);
    }

    public static void postOrder(Node n) {
        /** f e c d b g a */

        if (n == null) {
            return;
        }
        postOrder(n.left);
        postOrder(n.right);
        System.out.println(n.value + " ");
    }

    public static void inOrder(Node n) {
        /** e f c b d a g */

        if (n == null) {
            return;
        }
        inOrder(n.left);
        System.out.println(n.value + " ");
        inOrder(n.right);
    }

    public static Node createData() {
        /**
         *              a
         *             / \
         *            b   g
         *           / \
         *          c   d
         *         /
         *        e
         *         \
         *          f
         */
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");

        a.left = b;
        a.right = g;

        b.left = c;
        b.right = d;

        c.left = e;

        e.right = f;

        return a;
    }
}