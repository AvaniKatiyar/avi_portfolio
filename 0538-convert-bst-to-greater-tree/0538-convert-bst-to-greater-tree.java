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
    private int sum=0;
    private int c=0;
    public TreeNode convertBST(TreeNode root) {
       inorder(root);
       inorder2(root);
       return root;
     }
    private void inorder(TreeNode root)
    {
    if(root==null) return ;
    inorder(root.left);
    sum+=root.val;
    inorder(root.right);
    }
    private void inorder2(TreeNode root)
    {
        if(root==null)
        return;
        inorder2(root.left);
        int v=root.val;
        root.val=sum-c;
        c+=v;
        inorder2(root.right);
    }
}