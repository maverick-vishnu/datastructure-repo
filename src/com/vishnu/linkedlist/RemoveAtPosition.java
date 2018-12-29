package com.vishnu.linkedlist;

import java.util.Scanner;

import com.vishnu.linkedlist.InsertAtPosition.Node;

public class RemoveAtPosition {

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
		System.out.println("Enter the position to be deleted :");
		int posToRemove = sc.nextInt();
		System.out.println("Printing before deletion :");
		print(head);
        head = remove(head ,posToRemove);
        System.out.println("Printing after deletion :");
        print(head);
	}

	static Node remove(Node head , int pos) {
		Node temp =head;
		if(pos ==1) {
			head= temp.next;
			return head;
		}
		for(int i=1 ; i < pos-1 ;i++) {
			temp=temp.next;
		}
		Node temp1 =temp.next;
		temp.next =temp1.next;
		return head;
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
