//	Assignment #: 2
//	Name: Rachel Helmstetter
//	StudentID:1202809408
// 	Lecture Topic: GUI Components
//  Description:

package cse494assign2;

import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyShape {

	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(red, green, blue));
		if (filled) {
			g.fillOval(x, y, width, height);
		}
		else {
			g.drawOval(x, y, width, height);
		}
	}

}
