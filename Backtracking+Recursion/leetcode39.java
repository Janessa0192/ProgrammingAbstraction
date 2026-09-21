class Solution {

    private void findCombination(int index,int[] arr,List<List<Integer>> ans,List<Integer> ds,int target){

        if(index == arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[index]<=target){
            ds.add(arr[index]);
            findCombination(index,arr,ans,ds,target-arr[index]);
            ds.remove(ds.size()-1);
        }
        findCombination(index+1,arr,ans,ds,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,candidates,ans,new ArrayList<>(),target);
        return ans;
    }
}