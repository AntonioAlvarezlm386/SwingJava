package gui.swing.labels;

import java.awt.Color;
import java.awt.Font;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

import gui.swing.img.Img;

public class Label1 extends JLabel{
	
	private static final long serialVersionUID = 1L;

	Border border = BorderFactory.createLineBorder(new Color(0xf96153),3); //create a new border (color, width)
	
	// Jlabel = a GUI dispaly area for a string of text, an image or both
	URL urlImg = Img.class.getResource("img.png");
	ImageIcon icon = new ImageIcon(urlImg);
	
	
	
	public Label1() {
	this.setText("This is my first label"); //set text of label
	this.setIcon(icon);
	this.setHorizontalTextPosition(JLabel.CENTER); //set TEXT righ, center or left
	this.setVerticalTextPosition(JLabel.TOP); // set TEXT top, center or botton
	this.setForeground(new Color(0xf96153)); // set the font color
	this.setFont(new Font("MV Boli", Font.BOLD , 30)); //set the font style (font, style, size)
	this.setIconTextGap(10); // set gap test to image
	this.setBackground(new Color(0xfce4be)); //set background color
	this.setOpaque(true); //display the backgrond
	this.setBorder(border);
	
	this.setVerticalAlignment(JLabel.CENTER); // set vertcal position of the CONTENT
	this.setHorizontalAlignment(JLabel.CENTER); // set horixontal position of the content
	
	//label.setBounds(0,0,500,500); //set position & dimension
	}
}
