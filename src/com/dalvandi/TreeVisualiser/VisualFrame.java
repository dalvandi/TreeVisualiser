/*
 * TreeVisualiser 
 * Author: Sadegh Dalvandi
 * Date: 23 November 2014
 * Website: www.dalvandi.com
 * 
 */

package com.dalvandi.TreeVisualiser;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.*;

@SuppressWarnings("serial")
class VisualFrame extends JFrame {

	ArrayList<ListNode> list;
	public VisualFrame(ArrayList<ListNode> l) {
	setTitle("Tree Visualiser");
	Toolkit tk = Toolkit.getDefaultToolkit();  
	int xSize = ((int) tk.getScreenSize().getWidth());  
	int ySize = ((int) tk.getScreenSize().getHeight());  
	setSize(xSize,ySize);
	setLocation(0,0);
	setVisible(true);
	list = l;
  }
  
  public void paint(Graphics g)
  {
	  super.paint(g);
	  
	  for(ListNode l : list)
	  {
		  g.setColor(Color.GREEN);
		  g.fillOval(l.x, l.y, 60, 30);
		  g.setColor(Color.RED);
		  g.drawOval(l.x, l.y, 60, 30);
		  g.setColor(Color.BLACK);
		  g.drawString(l.content + ":" + l.level, l.x+10, l.y+15);

		  if(l.parent!=null){
			  g.setColor(Color.BLUE);
			  g.drawLine(l.parent.x+30, l.parent.y+30, l.x+30, l.y);
		  }
			  
	  }	  
	  
	  
  }
}
