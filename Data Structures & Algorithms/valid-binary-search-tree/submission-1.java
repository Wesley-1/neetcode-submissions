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
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        final Queue<Object[]> queue = new LinkedList<>();
        queue.offer(new Object[]{ 
            root, 
            Long.MIN_VALUE, 
            Long.MAX_VALUE 
        });

        while (!queue.isEmpty()) {
            final Object[] current = queue.poll();
            final TreeNode node = (TreeNode) current[0];
            final long left = (long) current[1];
            final long right = (long) current[2];

            if (!(left < node.val && node.val < right))
                return false;

            if (node.left != null) queue.offer(new Object[]{
                node.left, 
                left, 
                (long) node.val
            });
        
            if (node.right != null) queue.offer(new Object[]{
                node.right,
                (long) node.val, 
                right
            });
        }

        return true;
    }
}
