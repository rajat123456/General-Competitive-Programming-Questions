//Problem-> https://leetcode.com/problems/balanced-binary-tree/description/ 

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        
        if(root==null)
            return true;
        
        int res=check(root);
        if(res>=1)
          return true;
        else 
        return false;
	}

	static int check(TreeNode root)
    {
      if(root==null)
        return 0;
      
      int left=check(root.left);
        if(left==-1)
            return -1;
      int right=check(root.right);
        if(right==-1)
            return -1;
      
      if(left==right)
        return 1+left;
      
      else if(left==right-1 || right==left-1)
        return 1+Math.max(left,right);
      
      else return -1;
    }	
        
    }
