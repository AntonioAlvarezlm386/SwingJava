package gui.swing.Buttons;

import java.awt.Color;
import java.awt.Font;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import gui.swing.img.Img;

public class Button1 extends JButton{
	
	public Button1() {
		URL url = Img.class.getResource("icon.png");
		ImageIcon icon = new ImageIcon(url);
		
	 this.setBounds(160,180,180,80);
	 this.setText("Click Me!");
	 this.setFocusable(false);
	 this.setIcon(icon);
	 this.setHorizontalTextPosition(JButton.CENTER);
	 this.setVerticalTextPosition(JButton.TOP);
	 this.setFont(new Font("Comic Sans", Font.BOLD, 20));
		//btn.setIcontextGap(-25);
	 this.setForeground(new Color(0xffbf75)); // Font color
	 this.setBackground(new Color(0x525558));	//btn background color
	 this.setBorder(BorderFactory.createEtchedBorder());
		
	}

}
