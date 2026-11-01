class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones){
            pq.add(stone);
        }

        while(pq.size()>1){

            int one = pq.poll();
            int two = pq.poll();

            if(one!=two){
                int val = one-two;
                pq.add(val);
            }
        }

        if(pq.size()==0) return 0;

        return pq.poll();
    }
}