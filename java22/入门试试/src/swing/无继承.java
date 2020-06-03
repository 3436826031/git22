package swing;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class 无继承 {

	
	public static void main(String args[]) {
		
		
		JPanel mb;
		JButton aj1;
		
		
		
		
	 JFrame tx=new JFrame("1212");//创建一个布局对象
	 tx.setLayout(new BorderLayout(10,10));//tx.设置布局（边框布局）
	
        mb=new JPanel();
        aj1=new JButton();
	 mb.add(aj1);
	 tx.setBounds(500,200,300,300);
	 
	 tx.add(new JButton("南"),BorderLayout.SOUTH);
	 tx.add(new JButton("东"),BorderLayout.EAST);
	  
	 mb.add(new JButton("上"));
	 mb.add(new JButton("中"));
	 
	 tx.add(mb,BorderLayout.CENTER);
	 
	 tx.setSize(300, 200);
	 tx.setLocation(200,200);
	 tx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 tx.setVisible(true); 

	 
	}
	

	
	
	
	
	
	
	
	
}
