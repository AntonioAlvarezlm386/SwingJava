package gui.swing.Buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import gui.swing.img.Img;
import gui.swing.panels.Label;

public class MyFrame extends JFrame  implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	JButton btn;	// to give the button a scope outside the constructor
	Label label;
	
	MyFrame(){
		label = new Label();
		
		URL url = Img.class.getResource("icon.png");
		ImageIcon icon = new ImageIcon(url);
		
		btn = new JButton();
		btn.setBounds(160,180,180,80);
		//btn.addActionListener(e -> this.add(label));
		btn.addActionListener(this); //adds an action listener to the button
		btn.setText("Click Me!");
		btn.setFocusable(false);
		btn.setIcon(icon);
		btn.setHorizontalTextPosition(JButton.CENTER);
		btn.setVerticalTextPosition(JButton.TOP);
		btn.setFont(new Font("Comic Sans", Font.BOLD, 20));
		//btn.setIcontextGap(-25);
		btn.setForeground(new Color(0xffbf75)); // Font color
		btn.setBackground(new Color(0x525558));	//btn background color
		btn.setBorder(BorderFactory.createEtchedBorder());
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.setTitle("Buttons");
		
		this.add(btn);
		this.add(label);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==btn) {
			 label.setVisible(false);
		 }
		
	}
}
