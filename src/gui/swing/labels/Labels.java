package gui.swing.labels;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import gui.swing.img.Img;

public class Labels {
	public static void main(String[] args) {
		
		// Jlabel = a GUI dispaly area for a string of text, an image or both
		
		Label1 label = new Label1();
		URL url = Img.class.getResource("icon.png");
		ImageIcon icon = new ImageIcon(url);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(1200, 900);
		//frame.setLayout(null); // to aply the setBounds method
		frame.setTitle("Labels");
		frame.setIconImage(icon.getImage());
		frame.setVisible(true);
		frame.add(label); // add all components before using .pack()
		frame.pack(); // fit content, 
	}
}
