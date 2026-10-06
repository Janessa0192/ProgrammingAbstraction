class Solution {

    Queue<Integer> q;

    public int countStudents(int[] students, int[] sandwiches) {

         q = new LinkedList<>();
         for(int student : students){
            q.add(student);
         }

         int count=0;
         int index=0;

        while(!q.isEmpty()){
            if(q.peek()==sandwiches[index]){  //want sandwitch
                  q.poll();
                  index++;
                  count=0;
            } else {    // don't want
                q.add(q.poll());
                count++;
                if(q.size()==count){
                    break;
                }
            }
        }

        return q.size();
    }
}