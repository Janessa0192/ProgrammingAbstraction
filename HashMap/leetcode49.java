class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();

        // each string to char arr
        // sort arr
        // key of sorted
        // put str values in sorted key
        // return values

        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new  String(arr);
            map.putIfAbsent(key,new ArrayList<String>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}