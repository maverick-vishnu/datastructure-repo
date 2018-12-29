package com.vishnu.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

import com.vishnu.linkedlist.InsertingAtBeginning.Node;

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
		reverse(head);
		System.out.println("Printing linked list after reversing :");
		print(head);
	}
private static void reverse(Node head) {
	if(head ==null) {
		return;
	}
	Node prev=null;
	Node nxt=null;
	Node temp= head;
	while(temp !=null) {
		nxt= temp.next;
		temp=prev;
		prev=nxt.next;
		
	}
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
