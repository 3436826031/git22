package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * �¼�����������һ�������̳нӿ�ActionListener����Ϊ�ӿ������¼�����ķ���
 * ���ַ���ʵ��1.����һ��ʵ����̳нӿڣ��ٸ�д����������ڴ���ʵ����Ķ�����ʵ��
 * 2.ֱ�����������ڲ��ࣨ�����ʹ��һ�αȽϺã�ֱ�Ӵ���ActionListener������󣬲���д�ӿڵķ������ɡ�
 * 
 * 
 * */
class ����¼� implements ActionListener {//ֱ�Ӵ���һ����ʵ�ֽӿ�
	
	public void actionPerformed(ActionEvent e) { 
		Object yuan=e.getSource();    //��ȡ�¼�Դ���¼��������齨��
		JButton aj1=(JButton)yuan;    //ת�ͳ�Ϊ�Լ���Ҫ���齨
		System.out.println("������"+aj1.getLabel()+"��");
		                    // TODO �Զ����ɵķ������
	}
	

}





public class �����¼����� {
	
	
	public static void main(String args[]) {	
		
		JFrame tx=new JFrame();//����һ������
		tx.setLayout(new FlowLayout());
		JButton aj1=new JButton("���ǰ���1");
		JButton aj2=new JButton("���ǰ���1");
		
		
		tx.add(aj1);
		
		tx.add(aj2);
		
		aj1.addActionListener(new ����¼�());//ͨ��ʵ�����࣬���÷���
		
		
		
		
		
		aj2.addActionListener(new ActionListener() {   // addActionListener(����); //ֱ�Ӵ��������ڲ�����ʵ��
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				
				System.out.println("���������ڲ���ķ���");
				
			}
		});
				
//ͨ��ʵ�����࣬���÷���
		
		
		
		
		
		
		
		
		
		
		tx.setBounds(500,200,300,300);
		tx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  tx.setVisible(true);
		 	
		
	}
	
	
	
	

}
