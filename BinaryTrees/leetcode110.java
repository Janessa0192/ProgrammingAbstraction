class Solution {
    
    public static int height(TreeNode root){

        if(root==null) return 0;
        int maxht=0;

        int leftht=height(root.left);
        if(leftht==-1) return -1;
        int rightht=height(root.right);
        if(rightht==-1) return -1;

        if(Math.abs(leftht-rightht)>1) return -1;

        return maxht=Math.max(leftht,rightht)+1;
    }
    public boolean isBalanced(TreeNode root) {
        
        return height(root)!=-1;
    }
}