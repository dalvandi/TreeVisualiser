/*
 * TreeVisualiser 
 * Author: Sadegh Dalvandi
 * Date: 23 November 2014
 * Website: www.dalvandi.com
 * 
 */

package com.dalvandi.TreeVisualiser;

public class Tester {

	public static void main(String[] args) {

		Node n = new Node("0");
		Node n1 = new Node("1");
		Node n2 = new Node("2");
		Node n3 = new Node("3");
		Node n4 = new Node("4");
		Node n5 = new Node("5");
		Node n6 = new Node("6");
		Node n7 = new Node("7");
		Node n8 = new Node("8");
		Node n9 = new Node("9");
		Node n10 = new Node("10");
		Node n11 = new Node("11");
		Node n12 = new Node("12");
		Node n13 = new Node("13");
		Node n14 = new Node("14");
		Node n15 = new Node("15");
		Node n16 = new Node("16");
		Node n17 = new Node("17");
		Node n18 = new Node("18");
		Node n19 = new Node("19");
		Node n20 = new Node("20");
		Node n21 = new Node("21");
		Node n22 = new Node("22");
		Node n23 = new Node("23");
		Node n24 = new Node("24");
		Node n25 = new Node("25");
		Node n26 = new Node("26");
		
		n2.addChild(n5);
		n2.addChild(n6);
		n2.addChild(n7);
		n2.addChild(n8);
		n2.addChild(n9);
		n2.addChild(n10);
		
		n7.addChild(n11);
		n7.addChild(n16);
		n7.addChild(n15);
		
		n9.addChild(n14);
		n9.addChild(n13);
		n9.addChild(n12);
		
		n16.addChild(n26);
		n16.addChild(n25);
		
		n3.addChild(n24);
		n10.addChild(n21);
		n1.addChild(n22);
		n22.addChild(n23);
		
		n4.addChild(n20);
		n4.addChild(n19);
		n4.addChild(n18);
		n4.addChild(n17);
		
		n.addChild(n1);
		n.addChild(n2);
		n.addChild(n3);
		n.addChild(n4);
		
		Visualiser v = new Visualiser();
		v.visualise(n);
	}

}
