class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        LinkedList<Integer> ls = new LinkedList<>();

        int i = num.length-1;
        int carry = 0;

        while(i>=0 || k>0 || carry>0){

            int sum = carry;

            if(i>=0){
                sum+= num[i];

                i--;
            }

            sum += (k%10);
            k = k/10;
            ls.addFirst(sum%10);
            carry = sum/10;
            
        }

        return ls;
    }
}