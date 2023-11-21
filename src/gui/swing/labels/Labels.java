package gui.swing.labels;

import javax.swing.JFrame;

public class Labels {
	public static void main(String[] args) {
		
		Label1 label = new Label1();
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(1200, 900);
		//frame.setLayout(null); // to aply the setBounds method
		frame.setTitle("Labels");
		frame.setVisible(true);
		frame.add(label); // add all components before using .pack()
		frame.pack(); // fit content, 
	}
}
