package gui.swing.borderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		
		// Layout Manager = defines the natural layout for components within a container
		
		// 3 common managers
		
		// Border Layout = a border layout places components in 5 areas: NORTH, SOUTH, WEST, EAST, CENTER.
		//					All the extra space is place in the center area

		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setTitle("Border Layout");
		frame.setLayout(new BorderLayout(10,0));		// to implement borderLayout and borders between panels
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		
		panel1.setBackground(new Color(0xa20a0a));
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setBackground(new Color(0xffa36c));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setBackground(new Color(0xf6eec9));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setBackground(new Color(0x799351));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setBackground(new Color(0xea906c));
		panel5.setPreferredSize(new Dimension(100,100));
		
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.WEST);
		frame.add(panel3, BorderLayout.SOUTH);
		frame.add(panel4, BorderLayout.CENTER);
		frame.add(panel5, BorderLayout.EAST);
		
	}
}
