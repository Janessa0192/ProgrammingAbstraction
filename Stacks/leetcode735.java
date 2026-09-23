class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<>();

        for(int val : asteroids){

            if(val>0) st.push(val);
            else{

                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(val)){
                    st.pop();
                }

                if(!st.isEmpty() && st.peek()==Math.abs(val) && st.peek()>0){
                   st.pop();
                } else if(st.isEmpty() || st.peek()<0){
                    st.push(val);
                }
            }
        }

        return st.stream().mapToInt(Integer::intValue).toArray();
    }
}