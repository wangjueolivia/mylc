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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result= new LinkedList<List<Integer>>();
        Queue<TreeNode> que= new LinkedList<TreeNode>();
        if(root== null){
            return result;
        }
        que.offer(root);
        while(!que.isEmpty()){
            int size=que.size();
            List<Integer> nodes=new LinkedList<Integer>();
            for(int i=0;i<size;i++){
                TreeNode head=que.poll();
                if(head.left!=null){
                    que.offer(head.left);
                }
                if(head.right!=null){
                    que.offer(head.right);
                }
                nodes.add(head.val);
            }
            result.add(nodes);
        }
        return result;
    }
}
