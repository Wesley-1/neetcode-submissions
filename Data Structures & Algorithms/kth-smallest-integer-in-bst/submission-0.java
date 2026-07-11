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
    public int kthSmallest(TreeNode root, int k) {
        return constructSortedArray(root).get(k - 1);
    }

    public List<Integer> constructSortedArray(TreeNode root) {
        if (root == null) return new ArrayList<>();

        final List<Integer> list = new ArrayList<>(constructSortedArray(root.left));
        list.add(root.val);
        list.addAll(constructSortedArray(root.right));

        return list;
    }
}
