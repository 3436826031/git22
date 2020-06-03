package swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Íø¸ñ²¼¾Ö {
	
	
	public static void main(String args[]) {
		
	JFrame tx=new JFrame();
	JPanel mb=new JPanel();

	mb.setLayout(new GridLayout(3,3,10,10));
	mb.add(new JButton("12"));
	mb.add(new JButton("22"));
	mb.add(new JButton("33"));
	mb.add(new JButton("12"));
	mb.add(new JButton("22"));
	mb.add(new JButton("33"));
	mb.add(new JButton("12"));
	mb.add(new JButton("22"));
	mb.add(new JButton("33"));
	
	
	 tx.add(mb);
	 tx.setSize(300, 200);
	 tx.setLocation(200,200);
	 tx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 tx.setVisible(true);
	}
}
