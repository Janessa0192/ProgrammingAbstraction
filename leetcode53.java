class Solution {
    public int maxSubArray(int[] nums) {
        
        long sum = 0;
        long max_sum = Long.MIN_VALUE;



        for(int i=0;i<nums.length;i++){

            sum+=nums[i];

            if(sum>max_sum){ 
                max_sum = sum;
                }

            if(sum<=0){ 
                sum = 0;
                }
            
        }

        return (int) max_sum;
    }
}