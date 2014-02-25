//	Assignment #: 2
//	Name: Rachel Helmstetter
//	StudentID:1202809408
// 	Lecture Topic: GUI Components
//  Description:

package cse494assign2;

import java.awt.Color;
import java.awt.Graphics;

public class MyLine extends MyShape {

	private int x2, y2;
	
	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(red, green, blue));
		g.drawLine(x, y, x2, y2);
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	

}
