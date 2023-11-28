package gui.swing.layoutManager;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		
		// Layout Manager = defines the natural layout for components within a container
		
		// 3 common managers
		
		// Border Layout = a border layout places components in 5 areas: NORTH, SOUTH, WEST, EAST, CENTER.
		//					All the extra space is place in the center area
		
		// FlowLayout = places components in a row, sized a their preferred size.
				//				If the orizontal space in the container is too samll, the FlowLayout class uses the next row

		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setTitle("Layout Manager");
		frame.setLayout(new GridLayout(2,2,10,10));		// 
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		
		panel1.setBackground(new Color(0xa20a0a));
		panel1.setPreferredSize(new Dimension(100,100));
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));						// LEADING, CENTER, TRAILING, and horizontal and vertical spacing
		
		panel2.setBackground(new Color(0xffa36c));
		panel2.setPreferredSize(new Dimension(100,100));
		panel2.setLayout(new GridLayout(4,3,10,10));			// GridLayout(rows,columns,horizontalgap,vertivalgap)
		
		panel3.setBackground(new Color(0xf6eec9));
		panel3.setPreferredSize(new Dimension(100,100));
		
		panel4.setBackground(new Color(0x799351));
		panel4.setPreferredSize(new Dimension(100,100));
		panel4.setLayout(new BorderLayout(10,10));				//to implement borderLayout and borders between panels. BorderLayout is the default property
		
		/*Buttons to demostrate flow layout-------------*/
		JLabel label = new JLabel();
		label.setText("FlowLayout");
		label.setPreferredSize(new Dimension(220,30));
		
		panel1.add(label);
		panel1.add(new Button("btn 1"));
		panel1.add(new Button("btn 2"));
		panel1.add(new Button("btn 3"));
		panel1.add(new Button("btn 4"));
		panel1.add(new Button("btn 5"));
		panel1.add(new Button("btn 6"));
		panel1.add(new Button("btn 7"));
		panel1.add(new Button("btn 8"));
		panel1.add(new Button("btn 9"));
		
		/*Grid layout-----------------------------------*/
		JLabel label2 = new JLabel();
		label2.setText("Grid Layout");
		label2.setPreferredSize(new Dimension(220,30));
		
		panel2.add(label2);
		panel2.add(new Button("btn 1"));
		panel2.add(new Button("btn 2"));
		panel2.add(new Button("btn 3"));
		panel2.add(new Button("btn 4"));
		panel2.add(new Button("btn 5"));
		panel2.add(new Button("btn 6"));
		panel2.add(new Button("btn 7"));
		panel2.add(new Button("btn 8"));
		panel2.add(new Button("btn 9"));
		
		/* Subpanels------------------------------------*/
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(new Color(0xbbbbbb));
		panel6.setPreferredSize(new Dimension(50,50));
		panel7.setBackground(new Color(0x3876bf));
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setBackground(new Color(0xe1aa74));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setBackground(new Color(0xf3f0ca));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setBackground(new Color(0x222222));
		panel10.setPreferredSize(new Dimension(50,50));
		
		panel6.add(new JLabel("Border Layout"));
		panel4.add(panel6, BorderLayout.NORTH);
		panel4.add(panel7, BorderLayout.SOUTH);
		panel4.add(panel8, BorderLayout.WEST);
		panel4.add(panel9, BorderLayout.EAST);
		panel4.add(panel10, BorderLayout.CENTER);
		
		
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		
	}
}
