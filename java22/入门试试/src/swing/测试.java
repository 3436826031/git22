package swing;

import java.awt.Container;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;





public class ���� {
	
	
	public static void main(String args[]) {	

	JButton aj1=new JButton("ws��ʣ���");
	JButton aj2=new JButton("ws��ʣ���");

	JFrame tx=new JFrame();

	
	tx.add(aj1);
		
   aj1.addActionListener(new ActionListener(){//�����ڲ��ֱ࣬�Ӵ�������
	   
	   public void actionPerformed(ActionEvent e) {
		
		System.out.println("12121");
		
		JDialog b=new JDialog();//����һ���Ի�
		b.setBounds(500,200,300,300);
		 b.setVisible(true);
		 b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// TODO �Զ����ɵķ������
		
	}  }
		  );
   
   

   
   
   
   
   


	tx.setBounds(500,200,300,300);
	
	 tx.setVisible(true);	
	 tx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
