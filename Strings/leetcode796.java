class Solution {
    public boolean rotateString(String s, String goal) {
        
        if (s.length() != goal.length()) {
    return false;
}

        String compare = s+s;
        if(compare.contains(goal)){
            return true;
        } else {
            return false;
        }
    }
}