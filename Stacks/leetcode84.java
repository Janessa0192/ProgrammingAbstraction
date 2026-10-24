class Solution {

    public int[] previousSmallerElement(int[] heights){
        
        int[] pse = new int[heights.length];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<heights.length;i++){

            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }

            if(st.isEmpty()){
                pse[i]=-1;
            } else{
                pse[i]=st.peek();
            }

            st.push(i);
        }

        return pse;
    }


    public int[] nextSmallerElement(int[] heights){
        
        int[] pse = new int[heights.length];
        Stack<Integer> st = new Stack<>();

        for(int i=heights.length-1;i>=0;i--){

            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }

            if(st.isEmpty()){
                pse[i]=heights.length;
            } else{
                pse[i]=st.peek();
            }

            st.push(i);
        }

        return pse;
    }

    public int largestRectangleArea(int[] heights) {
        
        int[] pse = previousSmallerElement(heights);
        int[] nse = nextSmallerElement(heights);

        int maxi = 0;

        for(int i=0;i<heights.length;i++){

            maxi = Math.max(maxi,(nse[i]-pse[i]-1)*heights[i]);
        }
        return maxi;
    }
}