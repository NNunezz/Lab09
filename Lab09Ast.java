//Lab09Ast.java
// This is the student, starting file of Lab 09A.
// This file provides the completed Tree class which is the superclass for the PineTree class.
// The PineTree class is provided, but students need to write the re-defined <drawLeaves> method.
// XmasTree will inherit from PineTree and is not provided.

import java.awt.*;
import java.applet.*;

public class Lab09Ast extends Applet
{
	public void paint(Graphics g)
	{
		//Tree myTree = new Tree();
		//myTree.drawTrunk(g);
		//myTree.drawLeaves(g);
		XmasTree myTree = new XmasTree();
		myTree.drawTrunk(g);
		myTree.drawLeaves(g);
		myTree.drawOrnaments(g);
		myTree.drawStar(g);
		myTree.drawPresents(g);
	}
}
class Tree
{
	// Do NOT alter this Tree class in any way!

	public void drawTrunk(Graphics g)
	{
		Expo.setColor(g,Expo.brown);
		Expo.fillRectangle(g,475,395,525,600);
	}

	public void drawLeaves(Graphics g)
	{
		Expo.setColor(g,Expo.green);
		Expo.fillCircle(g,500,300,100);
	}
}
class PineTree extends Tree
{
    public void drawLeaves(Graphics g)
    {
       Expo.setColor(g,Expo.green);
       Expo.fillPolygon(g,325,395,675,395,500,250);
       Expo.fillPolygon(g,375,320,625,320,500,215);
       Expo.fillPolygon(g,425,255,575,255,500,175);
    }
}
class XmasTree extends PineTree
{
    public void drawOrnaments(Graphics g)
    {
        Expo.setColor(g,Expo.red);
        Expo.fillCircle(g,500,215,12);// Top Leaves Uppermost center 1st
        Expo.fillCircle(g,510,250,12);// 2nd
        Expo.fillCircle(g,470,275,12);// Middle Leaves 3rd
        Expo.fillCircle(g,510,300,12);//4th
        Expo.fillCircle(g,555,308,12);//5th
        Expo.fillCircle(g,450,320,12);//6th
        Expo.fillCircle(g,400,360,12); //Bottom leaves  all to the left 7th
        Expo.fillCircle(g,485,370,12);// 8th
        Expo.fillCircle(g,545,365,12);// 9th
        Expo.fillCircle(g,600,375,12);// 10th all to the right
    }
    public void drawStar(Graphics g)
    {
        Expo.setColor(g,Expo.gold);
        Expo.fillStar(g,500,155,50,5);
    }
    public void drawPresents(Graphics g)
    {
        Expo.setColor(g,Expo.darkRed);
        Expo.fillRectangle(g,275,500,425,600);
        Expo.setColor(g,Expo.darkBlue);
        Expo.fillRectangle(g,575,500,725,600);
        Expo.setColor(g,Expo.gold);
        Expo.fillRectangle(g,335,500,365,600);// Red's
        Expo.fillRectangle(g,275,535,425,565);// Red's
        Expo.fillRectangle(g,635,500,665,600);//Blue's
        Expo.fillRectangle(g,575,535,725,565);// Blue's
    }
}


    

