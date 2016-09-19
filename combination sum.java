public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        sum(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }
    public void sum(List<List<Integer>> result, List<Integer> current,int[] candidates, int target, int start){
        if(target>0){
            for(int i=start;i<candidates.length;i++){
                 current.add(candidates[i]);
                 sum(result, current, candidates, target-candidates[i],i);
                 current.remove(current.size()-1);
            }
        }
        else if(target==0){
            result.add(new ArrayList(current));
        }
    }
}
