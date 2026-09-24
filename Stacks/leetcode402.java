class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character> st = new Stack<>();

        for(int i=0;i<num.length();i++){

            while(!st.isEmpty() && k>0 && (num.charAt(i)-'0') < (st.peek()-'0')){
                st.pop();
                k--;
            }

            st.push(num.charAt(i));
        }

        while(k>0){          
            st.pop();
            k=k-1;
        }
         if(st.isEmpty()) return "0";

      String res = "";
        while(!st.isEmpty()) {
       res += st.pop();
        }

        String rev = "";

    for (int i = res.length() - 1; i >= 0; i--) {
        rev += res.charAt(i);
    }
        
        int i=0;
        while(i<rev.length() && rev.charAt(i)=='0'){
            i++;
        }

        if (i == rev.length()) {
            return "0";
        }

        return rev.substring(i);

    }
}