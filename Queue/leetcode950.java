class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        
        Arrays.sort(deck);

        Queue<Integer> q= new LinkedList<>();

        int n = deck.length;

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            q.add(i);
        }

        for(int card : deck){

            arr[q.poll()] = card;

            if(!q.isEmpty()){
                q.add(q.poll());
            }
        }

        return arr;
    }
}