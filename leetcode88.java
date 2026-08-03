class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int low1 = 0;
        int low2 = 0;

        int k = 0;
        int mid = nums1.length-nums2.length-1;

        int temp[] = new int[nums1.length];

        while(low1 <= mid && low2 < nums2.length){

            if(nums1[low1]<=nums2[low2]){
               temp[k++] = nums1[low1++];
            } else {
                temp[k++] = nums2[low2++];
            }
        }

        while(low1 <= mid){
            temp[k++] = nums1[low1++];
        }
        while(low2 < nums2.length){
            temp[k++] = nums2[low2++];
        }

        for(int i=0;i<nums1.length;i++){
            nums1[i] = temp[i];
        }
    }
}