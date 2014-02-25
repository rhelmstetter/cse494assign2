//	Assignment #: 2
//	Name: Rachel Helmstetter
//	StudentID:1202809408
// 	Lecture Topic: GUI Components
//  Description:


package cse494assign2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class DesktopFrame extends JFrame {
	private JDesktopPane theDesktop;
	private int windowCount = 0;
	private JMenu windowMenu;
	
	
	public DesktopFrame() {
		super("CSE 494 - Java Assignment 2");
		
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		windowMenu = new JMenu("Window");
		JMenu multimediaMenu = new JMenu("Multimedia");
		
		JMenuItem newWindow = new JMenuItem("New");
		JMenuItem exit = new JMenuItem("Exit");
		fileMenu.add(newWindow);
		fileMenu.add(exit);
		
		// Window Menu will contain all child windows created by file->new
		
		JMenuItem audio = new JMenuItem("Audio");
		JMenuItem video = new JMenuItem("Video");
		multimediaMenu.add(audio);
		multimediaMenu.add(video);
		
		bar.add(fileMenu);
		bar.add(windowMenu);
		bar.add(multimediaMenu);
		
		setJMenuBar(bar);
		theDesktop = new JDesktopPane();
		add(theDesktop);
				
		newWindow.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JInternalFrame frame = new JInternalFrame("New Window " + ++windowCount, true, true, true, true);
				
				MyJPanel panel = new MyJPanel();
				frame.add(panel, BorderLayout.CENTER);
				
				frame.pack();
				theDesktop.add(frame);
				frame.setVisible(true);
				
				JMenuItem window = new JMenuItem("New Window " + windowCount);
				windowMenu.add(window);
				windowMenu.updateUI();
			}
		});
		
		
	}
	
	
}
