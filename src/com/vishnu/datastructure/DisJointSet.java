package com.vishnu.datastructure;

import java.util.HashMap;
import java.util.Map;

public class DisJointSet {

	Map<Long ,Node> set = new HashMap<>();
	
	class Node {
		long data;
		int rank;
		Node parent;
	}
	
	public void makeSet(long data) {
		Node node = new Node();
		node.data=data;
		node.rank=0;
		node.parent=node;
		set.put(data, node);
	}
	
	public void union (long data1 ,long data2) {
		Node node1 = set.get(data1);
		Node node2 = set.get(data2);
		
		Node parent1 = findSet(node1);
		Node parent2 = findSet(node2);
		
		if(parent1.data == parent2.data) {
			return;
		}
		
		if(parent1.rank >= parent2.rank) {
			parent1.rank = (parent1.rank == parent2.rank) ? parent1.rank +1 : parent1.rank;
			parent2.parent=parent1;
		}
		else {
			parent1.parent=parent2;
		}
		
	}
	
	private Node findSet(Node node) {
		Node parent = node.parent;
		if(parent == node) {
			return parent;
		}
		node.parent = findSet(node.parent);
		return node.parent;
	}
	
	public long findSet(long data) {
		return findSet(set.get(data)).data;
	}
	
	public static void main(String [] args) {
		DisJointSet set = new DisJointSet();
		set.makeSet(1);
		set.makeSet(2);
		set.makeSet(3);
		set.makeSet(4);
		set.makeSet(5);
		set.makeSet(6);
		set.makeSet(7);
		
		set.union(1, 2);
		
		System.out.println(set.findSet(2));
	}
}
