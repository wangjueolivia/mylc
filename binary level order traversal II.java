/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result= new LinkedList<List<Integer>>();
        Queue<TreeNode> que=new LinkedList<TreeNode>();
        if(root==null){
            return result;
        }
        que.offer(root);
        while(!que.isEmpty()){
            int size=que.size();
            LinkedList<Integer> level=new LinkedList<Integer>();
            for(int i=0;i<size;i++){
                TreeNode current=que.poll();
                //LinkedList<Integer> level=new LinkedList<Integer>();
                if(current.left!=null){
                    que.offer(current.left);
                }
                if(current.right!=null){
                    que.offer(current.right);
                }
                level.add(current.val);
            }
            result.add(0,level);
        }
        return result;
    }
}
