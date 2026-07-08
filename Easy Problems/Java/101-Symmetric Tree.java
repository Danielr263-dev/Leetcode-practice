//Definition for a binary tree node.
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class Solution {
    public boolean isSymmetric(TreeNode root) {
        /* If we traverse both sides at the same time, 2 base cases: 1) if both sides are null at the same time, return true since we reached the end of the tree. 2) If one of the sides is null, return false since its not symmetric. 

        if we go left on left side, go right on right side. If we go right on left side, go left on right side. */

        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode n1, TreeNode n2){

        if(n1 == null && n2 == null)
            return true; //end of tree has been reached 
        
        if(n1 == null || n2 == null)
            return false; //either side is longer than the other, not symmetrical

        return n1.val == n2.val && isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);

        /*checks vals at current spots, checks symmytry both ways by comparing n1 left, n2 right AND n1 right, n2 left, at the SAME time (technically) */

    }
}