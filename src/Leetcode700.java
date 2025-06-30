public class Leetcode700 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
    public static TreeNode searchBST(TreeNode root, int value) {

        TreeNode currentNode = root;
        while (currentNode != null) {
            if(currentNode.val > value) {
                currentNode = currentNode.left;
            } else if (currentNode.val < value) {
                currentNode = currentNode.right;
            }
            else {
                root = currentNode;
                return root;
            }
        }
        return null;
    }

    public static void preOrder (TreeNode node) {

        if (node != null) {
            System.out.print( node.val + " -> ");
            preOrder(node.left);
            preOrder(node.right);
        }

    }

    public static void main(String[] args) {
        TreeNode n1, n2, n3, n4, n5;
        n5 = new TreeNode(3, null, null);
        n4 = new TreeNode(1, null, null);
        n3 = new TreeNode(7, null, null);
        n2 = new TreeNode(2, n4, n5);
        n1 = new TreeNode(4, n2, n3);
        preOrder(n1);
        System.out.println();
        preOrder(searchBST(n1, 5));

    }
}
