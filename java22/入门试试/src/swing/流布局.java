package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class 流布局 {
	
	public static void main(String args[]) {	
		
		JPanel mb;
		JButton aj1;
		mb=new JPanel();

	 JFrame tx=new JFrame("流布局");//创建一个布局对象    直接设置到面板上这个布局
	 mb.setLayout(new FlowLayout());//mb.设置布局（流布局）
	
	 //tx.setBounds(500,200,300,300);
	 mb.add(new JButton("1"));
	 mb.add(new JButton("2"));
	 mb.add(new JButton("3"));
	 mb.add(new JButton("4"));
	 mb.add(new JButton("5"));
	 mb.add(new JButton("6"));
	 
	 
	 
	 
	 tx.add(mb);
	 tx.setSize(300, 200);
	 tx.setLocation(200,200);
	 tx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 tx.setVisible(true);
	 
	}
	

	
	
	
	
	
	
	
	
}
