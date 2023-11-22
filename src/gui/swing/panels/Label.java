package gui.swing.panels;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import gui.swing.img.Img;

public class Label extends JLabel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	URL url = Img.class.getResource("icon2.png");
	ImageIcon panelIcon = new ImageIcon(url);
	
	public Label() {
		this.setText("Label text");
		this.setHorizontalTextPosition(CENTER);
		this.setVerticalTextPosition(TOP);
		this.setBounds(200,0,100,120);  //position relative to the container(Panel)
		this.setIcon(panelIcon);
	}
	
}
