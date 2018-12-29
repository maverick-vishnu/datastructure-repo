package com.vishnu.stack;

public class ArrayStack<E> {
	
	private E e;
	private int top= -1;
	private static final int INITIAL_SIZE=10;
	private Object[] stack;
	
	private int size=0;
	

	public ArrayStack() {
		stack = new Object[INITIAL_SIZE];
	}
	
	public ArrayStack(int size) {
		stack = new Object[size];
	}
	
	public void push(E e) throws Exception {
		if(size == top) {
			throw new Exception("stack is full");
		}
		stack[++top]=e;
		size++;
	}
	
	public void pop() throws Exception {
		if(top == -1) {
			throw new Exception("stack is empty");
		}
		stack[top]=null;
		top=top-1;
		size--;
	}
	
	public E peek() throws Exception {
		if(top == -1) {
			throw new Exception("stack is empty");
		}
		return (E) stack[top];
	}
	
	public boolean isEmpty() {
		return top ==-1 ? true : false;
	}
	
	public int size() {
		return size;
	}
}
