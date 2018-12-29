package com.vishnu.stack;

import java.util.LinkedList;
import java.util.Scanner;


public class ReverseLinkedList {
	
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
		System.out.println("Enter the size of linked list :");
		int n = sc.nextInt();
		Node head =null;
		for(int i =0 ; i<n ;i++) {
			System.out.println("Enter the number to insert in linked list :");
			int x = sc.nextInt();
			head=insert(head ,x);
		}
		System.out.println("Printing linked list before reversing :");
		print(head);
		head = reverseUsingStack(head);
		System.out.println("Printing linked list after reversing :");
		print(head);
	}

private static Node reverseUsingStack(Node head) {
	LinkedList<Node> list = new LinkedList<>();
	Node temp=head;
	while(temp !=null) {
		list.push(temp);
		temp=temp.next;
	}
	head= list.peek();
	list.pop();
	Node temp1=head;
	while(!list.isEmpty()) {
		temp1.next=list.peek();
		temp1=temp1.next;
		list.pop();
	}
	if(list.isEmpty()) {
		temp1.next=null;
	}
	return head;
}

public static Node insert(Node head , int a) {
	
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

	
	

}
