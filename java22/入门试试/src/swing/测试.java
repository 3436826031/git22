package swing;

import java.awt.Container;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;





public class 测试 {
	
	
	public static void main(String args[]) {	

	JButton aj1=new JButton("ws无剩余的");
	JButton aj2=new JButton("ws无剩余的");

	JFrame tx=new JFrame();

	
	tx.add(aj1);
		
   aj1.addActionListener(new ActionListener(){//匿名内部类，直接创建对象
	   
	   public void actionPerformed(ActionEvent e) {
		
		System.out.println("12121");
		
		JDialog b=new JDialog();//创建一个对话
		b.setBounds(500,200,300,300);
		 b.setVisible(true);
		 b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// TODO 自动生成的方法存根
		
	}  }
		  );
   
   

   
   
   
   
   


	tx.setBounds(500,200,300,300);
	
	 tx.setVisible(true);	
	 tx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
