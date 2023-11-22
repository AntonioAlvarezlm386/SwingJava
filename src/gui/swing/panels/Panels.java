package gui.swing.panels;

import java.awt.Color;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gui.swing.img.Img;

public class Panels {
	
	public static void main(String[] args) {
		// JPanel: component that functions as a container to hod other components
		
		URL url = Img.class.getResource("Icon.png");
		ImageIcon icon = new ImageIcon(url);
		
		Label label1 = new Label();
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(0x73c5aa));
		panel1.setBounds(0,0,150,150);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(0xf9a177));
		panel2.setBounds(150,0,150,150);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(0xf75167));
		panel3.setBounds(0,150,300,150);
		panel3.setLayout(null); // To apply setBounds method
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null); // to aply setBounds method
		frame.setSize(500,500);
		frame.setIconImage(icon.getImage());
		frame.setVisible(true);
		panel3.add(label1);
		
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		
	}
	
	
	
}
