package com.masai;

public class DoublyLinkedList {

	
	static class Node{
		
		int data;
		Node prev;
		Node next;
		
		Node(int data){
			this.data = data;
			this.prev = null;
			this.next = null;
		}
		
		
	}

	
	
	
		public static void main(String[] args) {
			
			
			
		    Node head = new Node(10);
			Node second = new Node(20);
            Node third = new Node(30);
            Node fourth = new Node(40);
            
            
            head.next = second;
            second.prev=head;
            
            second.next=third;
            
            third.prev=second;
            third.next = fourth;
            fourth.prev = third;
            
            
//            Create a doubly linked list and take two values from the user: 
//            key and value. Insert the new node after the node containing key.
            
//            int key = 30; int val = 40;
//            
//            Node temp = head;
//            while(temp!=null) {
//            	
//            	
//            	
//            	if(temp.data == key) {
//            		
//            		Node value = new Node(val);
//            		if(temp.next!=null) {
//            			temp.next.prev = value;
//            		}
//            		value.next = temp.next;
//            		temp.next = value;
//            		value.prev = temp;
//            	}
//            	temp = temp.next;
//              }
//            

//            remove all occurences of value
//            int value = 20;
//            
//            Node temp = head;
//            
//            // 20 - 20 - 30 - 40
//            
//            while(temp!=null) {
//            	
//            	if(temp.data == value) {
//            		if(temp.prev!=null) {
//                		temp.prev.next = temp.next;
//                	} else {
//                		head = temp.next;
//                	}
//                	
//                	if(temp.next!=null) {
//                		temp.next.prev = temp.prev;
//                	}
//            	}
//            	temp = temp.next;
//            }
            
//            reverse doubly linked list
//            Node temp = head;Node newhead = null;
//            
//            while(temp!=null) {
//            	
//            	Node swap = temp.prev;
//            	temp.prev = temp.next;
//            	temp.next = swap;
//            	
//            	newhead = temp;
//             
//             temp = temp.prev;
//            }
//            
//            head = newhead;
            
            //            find 2nd largest element
               
            // Node temp = head;
            // int maxi = Integer.MIN_VALUE;
            // int sec_maxi = Integer.MIN_VALUE;
            // while(temp!=null) {
            	
            // 	if(temp.data>maxi) { 
            // sec_maxi = maxi;
            // 	maxi = temp.data;
            // 	} else if(temp.data<maxi && temp.data>sec_maxi) {
            // 		sec_maxi = temp.data;
            // 	}
            // 	temp = temp.next;
            // }
            // System.out.println(maxi);
            // System.out.println(sec_maxi);
            


			            // check if palindrome
//            Node left = head;
//            Node right = head;
//            boolean palindrome = true;
//            while(right.next!=null) {
//            	right = right.next;
//            }
//            
//            while(left!=right  && left.prev!=right) { // left.prev=right is imp for even length the pointers 
//            	// left and rigth are never at same position so it can lead to infinte loop so it checks
//            	// when they cross each other if left se phle right agya 
//            	
//            	if(left.data!=right.data) {
//            		palindrome=false;
//            		break;
//            	}
//            	left = left.next;
//            	right = right.prev;
//            }
//            
//            if(palindrome) System.out.println("true");
//            else System.out.println("false");
            
            
           // print DLL
          Node curr = head;
          while(curr!=null) {
          	System.out.println(curr.data);
          	curr = curr.next;
          }
            
		}}
