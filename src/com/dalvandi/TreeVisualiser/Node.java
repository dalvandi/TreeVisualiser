package com.dalvandi.TreeVisualiser;

import java.util.ArrayList;

public class Node {
	
	
	String content;
	ArrayList<Node> children;
	
	Node(String s){
		children = new ArrayList<Node>();
		content = s;		
	}
	
	public void addChild(Node n)
	{
		children.add(n);
	}

}
