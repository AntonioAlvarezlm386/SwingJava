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
		frame.setLayout(new BorderLayout(10,0));		// to implement borderLayout and borders between panels. BorderLayout is the default property
		
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
		panel4.setLayout(new BorderLayout(10,10));
		
		panel5.setBackground(new Color(0xea906c));
		panel5.setPreferredSize(new Dimension(100,100));
		
		
		/* Subpanels------------------------------------*/
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(new Color(0x192655));
		panel6.setPreferredSize(new Dimension(50,50));
		panel7.setBackground(new Color(0x3876bf));
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setBackground(new Color(0xe1aa74));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setBackground(new Color(0xf3f0ca));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setBackground(new Color(0x222222));
		panel10.setPreferredSize(new Dimension(50,50));
		
		panel4.add(panel6, BorderLayout.NORTH);
		panel4.add(panel7, BorderLayout.SOUTH);
		panel4.add(panel8, BorderLayout.WEST);
		panel4.add(panel9, BorderLayout.EAST);
		panel4.add(panel10, BorderLayout.CENTER);
		
		
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.WEST);
		frame.add(panel3, BorderLayout.SOUTH);
		frame.add(panel4, BorderLayout.CENTER);
		frame.add(panel5, BorderLayout.EAST);
		
	}
}
