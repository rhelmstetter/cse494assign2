//	Assignment #: 2
//	Name: Rachel Helmstetter
//	StudentID:1202809408
// 	Lecture Topic: GUI Components
//  Description:

package cse494assign2;

import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends MyShape {

	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(red, green, blue));
		if (filled) {
			g.fillRect(x, y, width, height);
		} else {
			g.drawRect(x, y, width, height);
		}

	}

}
