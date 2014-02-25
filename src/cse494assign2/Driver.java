//	Assignment #: 2
//	Name: Rachel Helmstetter
//	StudentID:1202809408
// 	Lecture Topic: GUI Components
//  Description: 


package cse494assign2;

import javax.swing.JFrame;

public class Driver {

	public static void main(String[] args) {
		DesktopFrame desktopFrame = new DesktopFrame();
		desktopFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		desktopFrame.setSize(600, 480);
		desktopFrame.setVisible(true);
	}

}
