package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ������ {
	
	public static void main(String args[]) {	
		
		JPanel mb;
		JButton aj1;
		mb=new JPanel();

	 JFrame tx=new JFrame("������");//����һ�����ֶ���    ֱ�����õ�������������
	 mb.setLayout(new FlowLayout());//mb.���ò��֣������֣�
	
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
