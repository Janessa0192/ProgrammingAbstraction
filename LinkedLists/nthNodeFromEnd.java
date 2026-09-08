# nth node from end of sll

1 -> 2 -> 3 -> 4 -> 5 -> NULL

int n = 2 // to find 2nd last node

Node temp = head;

int total = 0;

while(temp!=NULL){

 total += 1;
 temp = temp.next;
}

int ans = total - n + 1;

temp = head;
int count = 0;

while(temp!=NULL){
  
count++;
if(count==ans) return temp.data;
temp = temp.next;
  
}


// alter

Node slow = head;
Node fast = head;

for(int i=0;i<n;i++){
    fast = fast.next;
}

while(fast!=NULL){
  slow = slow.next;
  fast = fast.next;
}

return slow.data;


