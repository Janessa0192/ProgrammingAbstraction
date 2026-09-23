class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();
        
        for(String token : tokens){

            if(!"+/*-".contains(token)){
                st.push(Integer.parseInt(token));
                continue;
            }

            int a = st.pop();
            int b = st.pop();

            switch(token){

                case "+":
                st.push(a+b);
                break;

                case "-":
                st.push(b-a);
                break;

                case "*":
                st.push(a*b);
                break;

                case "/":
                st.push(b/a);
                break;
            }
        }

        return st.pop();
    }
}