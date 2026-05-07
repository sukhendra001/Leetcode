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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        boolean lefttoright = true;

        while(!q.isEmpty()){
            List<Integer> currLevel = new ArrayList<>();
            int size = q.size();

            while(size-- > 0){
                TreeNode curr = q.poll();

                if(lefttoright) {
                    currLevel.add(curr.val);
                }else{
                    currLevel.add(0, curr.val);
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            ans.add(currLevel);
            lefttoright = !lefttoright;

        }
        return ans;
        
    }
}