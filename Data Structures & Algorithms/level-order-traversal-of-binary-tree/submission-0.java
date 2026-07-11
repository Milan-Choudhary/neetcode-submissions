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

        List<List<Integer>> list = new ArrayList<>();

        if(root == null){
            return list;
        }

        List<Integer> res = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        res.add(root.val);

        list.add(new ArrayList<>(res));


        while(q.size() > 0){
            res.clear();
            int len = q.size();

            for(int i = 0; i<len; i++){
                TreeNode n = q.poll();
                if(n.left != null){
                    q.add(n.left);
                    res.add(n.left.val);
                }
                if(n.right != null){
                    q.add(n.right);
                    res.add(n.right.val);
                }
            }
           
            if(res.size() != 0){
                list.add(new ArrayList<>(res));
            }
           

        }

        return list;
        
    }
}
