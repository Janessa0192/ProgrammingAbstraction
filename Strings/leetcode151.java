class Solution {
    public String reverseWords(String s) {
        
        String ans = ""; int end=s.length();
        for(int i=s.length()-1;i>=0;i--){
             if(s.charAt(i)==' '){
                ans += s.substring(i+1,end);
                ans+= ' ';
                end = i;
             }
        }

        ans += s.substring(0,end);
        return ans.trim().replaceAll("\\s+"," ");
    }
}