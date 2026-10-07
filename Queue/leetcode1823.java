class Solution {
    public int findTheWinner(int n, int k) {
        
        Queue<Integer> q = new LinkedList<>();

        for(int i=1;i<=n;i++){
            q.add(i);
        }

        while(q.size()>1){

            for(int j=0;j<k-1;j++){
                q.add(q.poll());
            }

            q.poll();
        }

        return q.poll();
    }
}