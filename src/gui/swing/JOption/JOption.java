package gui.swing.JOption;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import gui.swing.img.Img;

public class JOption {
	public static void main(String[] args) {
		//JOptionPane = pop up a standart dialog box that prompts users for a value or informs them of something
		
		//JOptionPane.showMessageDialog(null, "this is some useless info", "Example", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "here is more useless info", "Example", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Really?", "Example", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Your computer has a virus!!", "Example", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Keep calm and call tech support!!", "Example", JOptionPane.ERROR_MESSAGE);
		
		//System.out.println(JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "this i the title", JOptionPane.YES_NO_CANCEL_OPTION));
		
		//String name = JOptionPane.showInputDialog("What is your name?");
		//System.out.println("Hello " + name);
		
		URL url = Img.class.getResource("icon.png");
		ImageIcon img = new ImageIcon(url);
		
		String[] responses = {"No, you are awesome!", "thanks!", "*Blush*"};
		
		JOptionPane.showOptionDialog(null, "You are awesome!", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, img, responses, 0);
	}
}
