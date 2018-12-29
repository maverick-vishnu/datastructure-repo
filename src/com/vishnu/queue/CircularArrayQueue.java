package com.vishnu.queue;

public class CircularArrayQueue<E> {

	private int front = -1;
	private int rear = -1;
	private Object[] queue;
	private static final int CAPACITY =10;
	private int size=0;
	
	public CircularArrayQueue() {
		queue= new Object[CAPACITY];
	}
	
	public CircularArrayQueue(int capacity) {
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
		int N =queue.length;
		if((rear+1)%N == front) {
				throw new Exception("Queue is full...");
		}
		else if (isEmpty()) {
			front=0;
			rear=0;
		}
		else {
			rear =(rear +1)%N;
		}
		queue[rear] =e;
		size++;
	}
	
	public void deQueue() throws Exception {
		int N =queue.length;
		if(isEmpty()) {
			throw new Exception("Queue is empty...");
		}
		else if (front == rear) {
			front =-1;
			rear =-1;
		}
		else {
			front =(front+1)%N;
		}
	}
	
}
