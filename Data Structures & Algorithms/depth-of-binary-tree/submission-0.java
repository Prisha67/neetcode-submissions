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
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int maxLeft = 0;
        int maxRight = 0;
        maxLeft = 1 + maxDepth(root.left);
        maxRight = 1 + maxDepth(root.right);
        
        return Math.max(maxRight,maxLeft);
    }
}
