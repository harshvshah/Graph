package com.ctci.graph;

import java.util.LinkedList;
import java.util.Queue;

public class isRouteBetweenTwoNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");

	}

	public boolean isRoute(Node a, Node b) {
		if(a==null || b==null) {
			return false;
		}
		else {
			Queue<Node> q = new LinkedList<Node>();
			a.marked = true;
			q.add(a);
			
			while (!q.isEmpty()) {
				Node r = q.remove();
				if(r == b) {
					return true;
				}
				else {
					for (Node child : a.nodes) {
						if(child.marked == false) {
							child.marked = true;
							q.add(child);
						}
					}
				}
			}
			
		}
		return false;
	}
}
