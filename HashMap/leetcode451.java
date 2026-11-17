class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> mp = new HashMap<>();

        for(char ch : s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)-> mp.get(b)-mp.get(a));

        pq.addAll(mp.keySet());
        StringBuilder res = new StringBuilder();

        while(!pq.isEmpty()){
            char ch = pq.poll();
            for(int i=0;i<mp.get(ch);i++){
                res.append(ch);
            }
        }
        return res.toString();
    }
}