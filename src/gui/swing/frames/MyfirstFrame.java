package gui.swing.frames;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyfirstFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyfirstFrame() {
		this.setTitle("My first Java Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		this.setResizable(false);	//prevent frame from being resize
		this.setSize(400, 400); //sets the frame's dimensions
		this.setVisible(true);  //make frame visible
		
		ImageIcon img = new ImageIcon("../icon.png"); //create an ImageIcon
		this.setIconImage(img.getImage()); // set the icon
		
		this.getContentPane().setBackground(new Color(0x54787d)); //change color bg, we can use rgb, hex...
	}
}
