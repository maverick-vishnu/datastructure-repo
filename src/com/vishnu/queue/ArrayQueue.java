package com.vishnu.queue;

public class ArrayQueue<E> {

	private int front = -1;
	private int rear = -1;
	private Object[] queue;
	private static final int CAPACITY =10;
	private int size=0;
	
	public ArrayQueue() {
		queue= new Object[CAPACITY];
	}
	
	public ArrayQueue(int capacity) {
		if(CAPACITY > capacity) {
			queue= new Object[CAPACITY];
		}
		else {
			queue= new Object[capacity];
		}
	}
	
	public boolean isEmpty() {
		return size ==0;
	}
	
	public boolean isFull() {
		return queue.length == size;
	}
	
	public void enQueue(E e) throws Exception {
		if(isFull()) {
				throw new Exception("Queue is full...");
		}
		else if (isEmpty()) {
			front=0;
			rear=0;
		}
		else {
			rear =rear +1;
		}
		queue[rear] =e;
		size++;
	}
	
	public void deQueue() throws Exception {

		if(isEmpty()) {
			throw new Exception("Queue is empty...");
		}
		else if (front == rear) {
			front =-1;
			rear =-1;
		}
		else {
			front =front+1;
		}
	}
	
}
