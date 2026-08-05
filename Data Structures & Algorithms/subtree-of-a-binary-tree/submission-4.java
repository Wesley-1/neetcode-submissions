/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;

        if (sameTree(root, subRoot))
            return true;
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean sameTree(TreeNode treeOne, TreeNode treeTwo) {
        if (treeOne == null && treeTwo != null) return false;
        if (treeOne != null && treeTwo == null) return false;
        if (treeOne == null && treeTwo == null) return true;
        
        final boolean left = sameTree(treeOne.left, treeTwo.left);
        final boolean right = sameTree(treeOne.right, treeTwo.right);
        
        return left && right && treeOne.val == treeTwo.val;
    }
}
