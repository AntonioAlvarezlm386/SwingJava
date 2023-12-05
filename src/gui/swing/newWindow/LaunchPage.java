package gui.swing.newWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{
	JFrame frame = new JFrame();
	JButton btn = new JButton("New Window!");
	
	
	
	LaunchPage(){
		btn.setBounds(100, 160,200,40);
		btn.setFocusable(false);
		btn.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(btn);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			frame.dispose();
			NewWindow myWindow = new NewWindow();
		}
		
	}
}
