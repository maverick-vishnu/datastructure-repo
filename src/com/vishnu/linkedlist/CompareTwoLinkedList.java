package com.vishnu.linkedlist;

import java.util.Scanner;

import com.vishnu.linkedlist.InsertAtPosition.Node;

public class CompareTwoLinkedList {

	static class Node {
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		Node headA =null;
		Node headB =null;
		System.out.println("Enter the size of first linked list :");
		int n1 = sc.nextInt();
		for(int i =0 ; i<n1 ;i++) {
			System.out.println("Enter the number to insert in the first linked list :");
			int x = sc.nextInt();
			headA=insert(headA, x);
		}
		System.out.println("Printing the first linked list :");
		print(headA);
		System.out.println("Enter the size of second linked list :");
		int n2 = sc.nextInt();
		for(int i =0 ; i<n2 ;i++) {
			System.out.println("Enter the number to insert in the secondlinked list :");
			int x = sc.nextInt();
			headB=insert(headB,x);
		}
		System.out.println("Printing the second linked list :");
		print(headB);
        boolean flag = compereTwoLinkedList(headA , headB); 
        	if(flag) {
        		System.out.println("Both the linked lists are equal !!!");
        	}
        	else {
        		System.out.println("lists are not equal !!!");
        	}
        
	}
	
private static Node insert(Node head , int a) {
		
		Node temp = new Node(a);
		if(head ==null) {
			head=temp;
			return head;
		}
		Node curr = head;
		temp.next = curr;
		head= temp;
		
		return head;
	}

private static void print(Node head) {
	Node curr = head;
	while(curr !=null) {
		System.out.print(" " +curr.data);
		curr=curr.next;
	}
	
}

private static boolean compereTwoLinkedList(Node headA , Node headB) {
	boolean flag= false;
	if(headA == null && headB ==null) {
		flag =true;
		return flag;
	}
	while(headA != null && headB !=null) {
		if (headA.data == headB.data) {
			flag=true;
		}
		headA=headA.next;
		headB=headB.next;
	}
	return flag;
}

}
