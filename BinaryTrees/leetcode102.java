class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ls = new ArrayList<>();

        if(root==null) return ls;

        q.add(root);
        
        while(!q.isEmpty()){

            List<Integer> l = new ArrayList<>();

            int size = q.size();
            
            for(int i=0;i<size;i++){

                TreeNode node = q.poll();
                l.add(node.val);

                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);        
            }
            
            ls.add(l);
        }

        return ls;
    }
}