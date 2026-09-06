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
    public List<List<Integer>> levelOrder(TreeNode root) {
        final List<List<Integer>> res = new ArrayList();

        if (root == null) return res;

        final Deque<TreeNode> nodes = new ArrayDeque();
        nodes.offer(root);

        while (!nodes.isEmpty()) {            
            final List<Integer> level = new ArrayList();
            
            final int size = nodes.size();
            for (int i = 0; i < size; i++) {
                final TreeNode node = nodes.poll();
                level.add(node.val);

                if (node.left != null) 
                    nodes.offer(node.left);

                if (node.right != null)
                    nodes.offer(node.right);
            }

            res.add(level);
        }

        return res;
    }
}
