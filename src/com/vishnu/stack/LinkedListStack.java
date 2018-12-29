package com.vishnu.stack;

public class LinkedListStack<E> {
	
	private Node<E> head;
	private int size=0;
	
	private static class Node<E> {
		E item;
		Node<E> next;
		
		public Node(E item ,Node next) {
			this.item=item;
			this.next=next;
		}
	}
	
	public void push(E e) {
		Node newNode = new Node(e,null);
		if(head ==null) {
			head=newNode;
		}
		newNode.next=head;
		head=newNode;
		size++;
	}
	
	public void pop() throws Exception {
		if(head ==null) {
			throw new Exception("Stack is empty");
		}
		Node temp =head;
		head=temp.next;
		temp=null;
		size--;
	}
	
	public E peek() throws Exception {
		if(head ==null) {
			throw new Exception("Stack is empty");
		}
		Node temp =head;
		E element = (E) temp.item;
		return element;
	}
	
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return head== null ? true :false;
	}

}
