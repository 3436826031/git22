package swing;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class �޼̳� {

	
	public static void main(String args[]) {
		
		
		JPanel mb;
		JButton aj1;
		
		
		
		
	 JFrame tx=new JFrame("1212");//����һ�����ֶ���
	 tx.setLayout(new BorderLayout(10,10));//tx.���ò��֣��߿򲼾֣�
	
        mb=new JPanel();
        aj1=new JButton();
	 mb.add(aj1);
	 tx.setBounds(500,200,300,300);
	 
	 tx.add(new JButton("��"),BorderLayout.SOUTH);
	 tx.add(new JButton("��"),BorderLayout.EAST);
	  
	 mb.add(new JButton("��"));
	 mb.add(new JButton("��"));
	 
	 tx.add(mb,BorderLayout.CENTER);
	 
	 tx.setSize(300, 200);
	 tx.setLocation(200,200);
	 tx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 tx.setVisible(true); 

	 
	}
	

	
	
	
	
	
	
	
	
}
