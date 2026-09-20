class Solution {


    public static void generateSubsets(int[] nums,int index,List<Integer> ans,List<List<Integer>> result){

        if(index==nums.length) {
            result.add(new ArrayList<>(ans));
            return;
        }
        
        ans.add(nums[index]);
        generateSubsets(nums,index+1,ans,result);

        ans.remove(ans.size()-1);
        generateSubsets(nums,index+1,ans,result);
    }

    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        generateSubsets(nums,0,ans,result);

        return result;
    }
}