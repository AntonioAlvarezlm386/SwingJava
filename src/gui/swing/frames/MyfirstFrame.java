package gui.swing.frames;

import java.awt.Color;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import gui.swing.img.Img;


public class MyfirstFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	URL urlIcon = Img.class.getResource("icon.png");
	
	public MyfirstFrame() {
		this.setTitle("My first Java Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		this.setResizable(false);	//prevent frame from being resize
		this.setSize(400, 400); //sets the frame's dimensions
		this.setVisible(true);  //make frame visible
		
		ImageIcon img = new ImageIcon(urlIcon); //create an ImageIcon
		this.setIconImage(img.getImage()); // set the icon
		
		this.getContentPane().setBackground(new Color(0x54787d)); //change color bg, we can use rgb, hex...
	}
}
