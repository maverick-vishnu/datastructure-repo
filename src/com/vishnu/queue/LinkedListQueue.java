package com.vishnu.queue;

public class LinkedListQueue<E> {
	
	static class Node<E>{
		E e;
		Node next;
	  public Node(E e) {
		  this.e=e;
		  next=null;
	  }
	}

	private Node front;
	private Node rear;
	private int size;
	
	public LinkedListQueue() {
		front=null;
		rear=null;
		size=0;
	}
	
	public void enQueue(E e) {
		
		Node temp = new Node(e);
		if(front==null && rear ==null) {
			front=rear=temp;
		}
		rear.next=temp;
		rear=temp;
		size++;
	}
	
	public void deQueue() {
		if(front==null && rear ==null) {
			return;
		}
		else if(front == rear) {
			front=rear=null;
		}
		else {
			Node tmp=front;
			front=tmp.next;
			tmp=null;
		}
		size--;
	}
	
	public static void main(String [] args) {
		LinkedListQueue q = new LinkedListQueue();
		q.enQueue("hey");
		q.enQueue("hello");
		q.deQueue();
		Node tmp =q.front;
		while(tmp !=null) {
			System.out.println(tmp.e);
			tmp=tmp.next;
		}
	}
}
