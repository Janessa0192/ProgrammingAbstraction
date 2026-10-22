class MyCircularDeque {

    int capacity;
    int front;
    int rear;
    int size;
    int[] arr;

    public MyCircularDeque(int k) {
        size=k;
        capacity=0;
        front=0;
        rear=-1;
        arr = new int[size];
    }
    
    public boolean insertFront(int value) {
        
        if(size==capacity) return false;

        if (isEmpty()) {
        front = 0;
        rear = 0;
       } else {
        front = (front - 1 + size) % size;
    }

        arr[front]=value;
        capacity+=1;
        return true;
    }
    
    public boolean insertLast(int value) {

        if(size==capacity) return false; 

        if (isEmpty()) {
        front = 0;
        rear = 0;
    } else {
       rear = (rear + 1) % size;
    }
 
        arr[rear]=value;
        capacity+=1;
        return true;
    }
    
    public boolean deleteFront() {
        
        if(isEmpty()) return false;

        
        if(capacity==1){
            front=0; rear=-1;
        } else {
            front = (front+1)%size;
        }

        capacity--;
        return true;
    }
    
    public boolean deleteLast() {
        
        if(isEmpty()) return false;

        if(capacity==1){
            front=0; rear=-1;
        } else {
            rear = (rear-1+size)%size;
        }

        capacity-=1;
        return true;
    }
    
    public int getFront() {
        
        if(isEmpty()) return -1;

        return arr[front];
    }
    
    public int getRear() {
        
        if(isEmpty()) return -1;

        return arr[rear];
    }
    
    public boolean isEmpty() {
        
        if(capacity==0) return true;

        return false;
    }
    
    public boolean isFull() {
        
        if(capacity==size) return true;

        return false;
    }
}
