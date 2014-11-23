/*
 * TreeVisualiser 
 * Author: Sadegh Dalvandi
 * Date: 23 November 2014
 * Website: www.dalvandi.com
 * 
 */

package com.dalvandi.TreeVisualiser;

public class ListNode {	
	
	int x;
	int y;
	int level;
	ListNode parent;
	String content;
	
	public ListNode(int x0, int y0, ListNode par, String c)
	{
		x = x0;
		y = y0;
		parent = par;
		content = c;
	}
	
	public ListNode(ListNode par, String c)
	{
		parent = par;
		content = c;
	}

}
