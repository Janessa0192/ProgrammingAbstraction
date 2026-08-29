class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();

        for(int num : nums){
            hs.add(num);
        }
        
        int max_cnt = 0;
        int cnt = 0;
        int ele = 0;
        for(int val : hs){

            if(!hs.contains(val-1)){

                cnt = 1;
                ele = val;
                while(hs.contains(ele+1)){
                    cnt++;
                    ele += 1;
                }

                max_cnt = Math.max(cnt,max_cnt);

            }
        }

        return max_cnt;
    }
}