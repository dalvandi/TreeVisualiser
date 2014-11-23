/*
 * TreeVisualiser 
 * Author: Sadegh Dalvandi
 * Date: 23 November 2014
 * Website: www.dalvandi.com
 * 
 */

package com.dalvandi.TreeVisualiser;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeToList {


	ArrayList<ListNode> orderedlist;
	Queue<Node> qn;	
	Queue<ListNode> qp;	

	TreeToList()
	{
		orderedlist = new ArrayList<ListNode>();
		qn = new LinkedList<Node>();
		qp = new LinkedList<ListNode>();
	}
	
	public void treeToList(Node n)
	{
		ListNode root = new ListNode(477,50,null,n.content);
		root.level = 0;
		orderedlist.add(root);
		treeToOrder(n, root,1);
	}

	
	private void treeToOrder(Node n, ListNode par, int lev)
	{
		for(Node no : n.children)
		{
			ListNode ch = new ListNode(par,no.content);
			ch.level = lev;
			orderedlist.add(ch);
			qn.add(no);
			qp.add(ch);
		}
		
		if(!qn.isEmpty())
		{
			while(qn.iterator().hasNext())
			{
				int l = qp.peek().level; 
				treeToOrder(qn.remove(), qp.remove(), l+1);
			}
		}
		setPositions();
	}
	
	private void setPositions()
	{
		int depth = getDepth();
		int largest = getTheLargestLevel();
		int longestlevel = (largest*60) + ((largest-1)*20);
		Toolkit tk = Toolkit.getDefaultToolkit();  
		int w = ((int) tk.getScreenSize().getWidth());  
		for(int i = 0; i<=depth; i++)
		{
		int j=0;
		int levelsize = getNumberOfNodeAtThisLevel(i);
		int space = (longestlevel - (levelsize*60)) / levelsize;
			for(ListNode ln: orderedlist)
			{
				if(ln.level == i)
				{
					if(levelsize == 1)
						ln.x = (w/2) - (((levelsize*60)+(levelsize-1)*20)/2);
					else
						ln.x =((j*60)+(j)*space) + (w/2) - (longestlevel/2);
					
					ln.y = (i*50)+50;
					j++;
				}

			}
		}
	}

	private int getNumberOfNodeAtThisLevel(int i) {
		int number = 0;
		for(ListNode l : orderedlist)
		{
			if(l.level == i)
			{
				number++;
			}
		}
		return number;
	}

	private int getDepth() {
		int depth = 0;
		
		for(ListNode l : orderedlist)
		{
			if(l.level >= depth)
			{
				depth = l.level;
			}
		}
		
		return depth;
	}

	private int getTheLargestLevel()
	{
		int depth = getDepth();
		int[] levelsize = new int[depth+1];
		for(int i = 0 ; i <= depth; i++)
			levelsize[i] = 0;
		
		for(int i = 0 ; i <= depth; i++)
		{
			for(ListNode ln: orderedlist)
			{
				if(ln.level == i)
					levelsize[i]++;
			}
		}
		
		int largest = 0;
		for(int i = 0 ; i <= depth; i++)
		{
			if(largest <= levelsize[i])
				largest = levelsize[i];
		}
		
		return largest;
		
	}

}
