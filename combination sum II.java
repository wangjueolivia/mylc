public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> current=new ArrayList<Integer>();
        sum(result,current,candidates, target,0);
        return result;
    }
    public void sum(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int start){
        if(target==0){
            result.add(new ArrayList(current));
            return;
        }
        else if(target>0){
            for(int i=start;i<candidates.length;i++){
                if(i>start && candidates[i]==candidates[i-1]){
                    continue;
                }
                current.add(candidates[i]);
                sum(result,current,candidates, target-candidates[i],i+1);
                current.remove(current.size()-1);
            }
        }
    }
}
