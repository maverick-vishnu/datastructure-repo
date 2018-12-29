package com.vishnu.linkedlist;

import java.util.Scanner;

public class InsertingAtBeginning {
	
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
		print(head);
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
	public static void print(Node head) {
		Node curr = head;
		while(curr !=null) {
			System.out.print(" " +curr.data);
			curr=curr.next;
		}
		
	}

}
