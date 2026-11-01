class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int[] freq = new int[26];

        for(char ch : tasks){
            freq[ch-'A']++;
        }
         
        // using max priority queue b'ze we need to completer big tasks as arranging it will make easy
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int val : freq){
            if(val > 0){
                pq.offer(val);
            }
        }

        int time=0;

        while(!pq.isEmpty()){
         
            int cycle = n+1;
            List<Integer> temp = new ArrayList<>();
            
            while(cycle>0 && !pq.isEmpty()){

                int count = pq.poll();

                if(count>1){
                    temp.add(count-1);
                }
                
                time++; cycle--;
            }

            for(int num : temp) pq.offer(num);

            if(!pq.isEmpty()) time+=cycle;
        }

        return time;
    }
}