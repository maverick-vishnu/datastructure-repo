package com.vishnu.queue;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseFewEleInQueue {

public static void main(String[] args) {
		
		LinkedList<Integer> queue= new LinkedList<Integer>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of data to be inserted in queue :");
		int n = sc.nextInt();
		System.out.println("Enter data to insert in queue :");
		for(int i=0; i< n ;i++) {
			queue.offer(sc.nextInt());
		}
		System.out.println("The data in queue" + queue);
		LinkedList<Integer> stack= new LinkedList<Integer>();
		System.out.println("Enter number of element to be reversed :");
		int ele = sc.nextInt();
		for(int i=0; i<ele ;i++) {
			stack.push(queue.poll());
		}
		while(!stack.isEmpty()) {
			queue.offer(stack.pop());
		}
		for(int i=0; i<queue.size()-ele ;i++) {
			queue.offer(queue.poll());
		}
		System.out.println("Queue after reversing few elements :"+queue);
	}
}
