package gui.swing.flowLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		// Layout Manager = Defines the natural layout for components within a container
		
		// FlowLayout = places components in a row, sized a their preferred size.
		//				If the orizontal space in the container is too samll, the FlowLayout class uses the next row
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setTitle("Flow Layout");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));	// LEADING, CENTER, TRAILING, and horizontal and vertical spacing
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(250,250));
		panel.setBackground(Color.green);
		panel.setLayout(new FlowLayout());
		
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		frame.add(panel);
		frame.setVisible(true);		//to avoid visibility issues, its a good practice set this at the end
	}
}
