package gui.swing.layeredPane;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class LayeredPane {
	public static void main(String[] args) {
		//JLayeredPane = swing container that provides a third dimension for positioning comoponents
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(new Color(0xff5b22));
		label1.setBounds(50,50,200,200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(new Color(0xff9130));
		label2.setBounds(100,100,200,200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(new Color(0xfecda6));
		label3.setBounds(150,150,200,200);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 500, 500);
		
		layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);	//DEFAULT, PALETTE, MODAL, POPUP, DRAG_LAYER
		layeredPane.add(label2, Integer.valueOf(2));			//We can use Numbers to select the layer
		layeredPane.add(label3, Integer.valueOf(1));
		
		JFrame frame = new JFrame();
		frame.add(layeredPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setTitle("LayeredPane");
		
	}
}
