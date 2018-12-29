package com.vishnu.linkedlist;

import java.util.Scanner;

import com.vishnu.linkedlist.InsertingAtBeginning.Node;

public class InsertAtPosition {
	
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
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		Node head =null;
		for(int i=0 ; i< n ; i++) {
			System.out.println("Enter the data to be inserted :");
			int data = sc.nextInt();
			System.out.println("Enter the position of data to be inserted :");
			int pos = sc.nextInt();
			try {
				head = insert(head , data , pos);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		print(head);
		
	}
	static Node insert(Node head ,int data ,int pos) throws Exception {
		Node newNode = new Node(data);
		if(pos < 1 ) {
			throw new Exception("pos is less");
		}
		if(pos ==1 ) {
			head= newNode;
			return head;
		}
		   Node temp =head;
			for(int i=1 ;i < pos-1 ;i++) {
				temp=temp.next;
			}
			newNode.next =temp.next;
			temp.next=newNode;
		
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
