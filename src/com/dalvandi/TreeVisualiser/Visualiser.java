/*
 * TreeVisualiser 
 * Author: Sadegh Dalvandi
 * Date: 23 November 2014
 * Website: www.dalvandi.com
 * 
 */

package com.dalvandi.TreeVisualiser;

import javax.swing.JFrame;

public class Visualiser{
	
	public void visualise(Node n)
	{
		TreeToList ttl = new TreeToList();
		ttl.treeToList(n);
		VisualFrame f = new VisualFrame(ttl.orderedlist);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
