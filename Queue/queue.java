class MyQueue{

     int[] arr;
     int front,rear,capactiy;

     MyQueue(int capactiy){

        this.capactiy = capactiy;
        front = 0;
        rear = -1;
        arr = new int[capactiy];
     }

     void enqueue(int value){

        if(rear==capactiy-1){
            System.out.println("Queue is full");
            return;
        }

        arr[++rear] = value;
     }

     void dequeue(){

        if(front>rear){
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(arr[front++]);
     }

     int peek(){

        if(front>rear){
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
     }

     public static void main(String[] args){

        MyQueue q = new MyQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
     }

};