class Solution {
    public double myPow(double x, int n) {
        
        long m = n;
        if(m<0) m=m*( -1);
        double ans = 1;
        while(m>0){

            if(m%2==1){
                ans *= x;
                m = m-1;
            } else {
                x = x*x;
                m = m/2;
            }

        }

        if(n<0) return 1/ans;
        else return ans;
    }
}