class Solution {

    public static boolean isVowel(char ch){
        return ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u';
    }

    public int maxVowels(String s, int k) {
        
        int vowelCount = 0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i)))
            vowelCount++;
        }

        int maxVowel = vowelCount;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k)))
            vowelCount--;
            if(isVowel(s.charAt(i)))
            vowelCount++;

            maxVowel = Math.max(maxVowel,vowelCount);
        }

           return maxVowel;
    }

   
}