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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result=new LinkedList<List<Integer>>();
        List<Integer> currentResult=new LinkedList<Integer>();
        pathSum(root,sum, currentResult, result);
        return result;
    }
    public void pathSum(TreeNode root, int sum, List<Integer> currentResult, List<List<Integer>> result ){
        if(root==null){
            return;
        }
        currentResult.add(root.val);
        if(root.left==null && root.right==null && root.val==sum){
            result.add(new LinkedList(currentResult));
        }
        else{
            pathSum(root.left,sum-root.val,currentResult, result);
            pathSum(root.right,sum-root.val,currentResult, result);
        }
        currentResult.remove(currentResult.size()-1);
    }
}
