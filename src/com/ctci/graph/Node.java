package com.ctci.graph;

import java.util.ArrayList;
import java.util.List;

public class Node {

	public Node(String name){
		this.name = name;
	}
	
	public Node(String name, List<Node> nodes) {
		this.name = name;
		this.nodes = nodes;
	}
	public String name;
	
	public List<Node> nodes = new ArrayList<Node>();
	
	boolean marked;
	
}
