public class ValidateBinarySearchTree {

    public static void main(String[] args) {

        TreeNode root = createData();

        Solution solution = new Solution();
        System.out.println(solution.isValidBST(root));
    }
    
    public static TreeNode createData() {
        TreeNode root = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node9 = new TreeNode(9);
        TreeNode node7 = new TreeNode(7);
        TreeNode node12 = new TreeNode(12);
        TreeNode node4 = new TreeNode(4);
        TreeNode node8 = new TreeNode(8);

        root.left = node2;
        root.right = node9;

        node9.left = node7;
        node9.right = node12;

        node7.left = node4;
        node7.right = node8;

        return root;
    }

}

class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    public boolean validate(TreeNode root, Integer max, Integer min) {
        if (root == null) {
            return true;
        }
        else if ((max != null && root.val >= max) || (min != null && root.val <= min)) {
            return false;
        } else {
            return validate(root.left, root.val, min) && validate(root.right, max, root.val);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        this.val = x;
    }
}
