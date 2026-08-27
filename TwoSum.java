class Solution {

    // use this if array not sorted else use 2 pointer technique optimizes space
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int complement = target-nums[i];

            if(mp.containsKey(complement)) return new int[]{mp.get(complement),i};

            mp.put(nums[i],i);
        }

      return new int[]{};
    }
}


// if sorted

class Solution {
    public int[] twoSum(int[] nums, int target) {
       
       int left = 0;
       int right = nums.length-1;

       while(left<right){

        int sum = nums[left]+nums[right];

        if(sum==target){
             return new int[]{left, right};
        } else if (sum<target){
            left++;
        } else {
            right--;
        }
       }

       return new int[]{};
    }
}