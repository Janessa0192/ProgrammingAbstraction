package com.masai;

public class Circularll {

	static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	Node head = null;
	
	public int countNodes() {
		
		Node temp = head.next;
		int count = 1;
		while(temp!=head) {
			count++;
			temp = temp.next;
		}
		
		return count;
	}
	
	public boolean target(int target) {
		
		Node temp = head.next;
		if(head.data == target) return true;
		while(temp!=head) {
			
			if(temp.data == target) {
				return true;
			}
			temp = temp.next;
		}
		return false;
		
	}
	
	public int deleteNodeBeg() {
		
		Node temp = head;
		while(temp.next!=head) {
			temp = temp.next;
		}
		head = head.next;
		temp.next = head;
		
		return head.data;
		
	}
	
	public int insertAtBeg(int value) {
		
		Node newNode = new Node(value);
		
		Node temp = head;
		while(temp.next!=head) {
			temp = temp.next;
			
		}
		temp.next = newNode;
		newNode.next = head;
		head = newNode;
		
		return head.data;		
		
	}
	
	public int maxEle() {
		
		Node temp = head.next;
		int maxi = head.data;
		while(temp != head) {
			if(temp.data > maxi) maxi = temp.data;
			temp = temp.next;
		}
		
		return maxi;
		
	}
	
	public static void main(String[] args) {
		
		 Circularll list = new Circularll();

	     Node newNode = new Node(10);

	    list.head = newNode;

		newNode.next = new Node(20);
		newNode.next.next = new Node(30);
		newNode.next.next.next = new Node(40);
		newNode.next.next.next.next = new Node(50);
		newNode.next.next.next.next.next = newNode;
		
		System.out.println(list.countNodes());
		System.out.println(list.target(10));
		System.out.println(list.deleteNodeBeg());
		System.out.println(list.insertAtBeg(10));
		System.out.println(list.maxEle());
	}
}
