package gui.swing.Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import gui.swing.panels.Label;

public class MyFrame extends JFrame  implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	Button1 btn;	// to give the button a scope outside the constructor
	Label label;
	
	MyFrame(){
		label = new Label();
		btn = new Button1();
		btn.addActionListener(this);	 //adds an action listener to the button		
		//btn.addActionListener(e -> this.add(label));		//ousing lambda func
		
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
