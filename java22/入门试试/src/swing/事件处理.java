package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class BtnClick implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		Object yuan=e.getSource();    //��ȡ�¼�Դ���¼��������齨��
		JButton aj1=(JButton)yuan;    //ת�ͳ�Ϊ�Լ���Ҫ���齨
		System.out.println("������"+aj1.getLabel()+"��");
		                    // TODO �Զ����ɵķ������
	}
	

}



public class �¼�����{
	
	
	public �¼�����() {
		JFrame tx=new JFrame();
		JButton aj2= new JButton("���Ե��1");
		JButton aj3= new JButton("���Ե��2");
		JButton aj4= new JButton("5555555555555555555555555");
		JPanel mb=new JPanel();
		

		mb.add(aj2);
		mb.add(aj3);
		mb.add(aj4);
		
		aj2.addActionListener(new BtnClick());
		aj3.addActionListener(new BtnClick());
		
	
		 
		 aj4.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
					Object yuan=e.getSource();    //��ȡ�¼�Դ���¼��������齨��
					JButton aj1=(JButton)yuan;    //ת�ͳ�Ϊ�Լ���Ҫ���齨
					
					System.out.println("������"+aj1.getLabel()+"��");
					                    // TODO �Զ����ɵķ������
				}

			 
		 });
		 
		 
	
			 
			tx.add(mb);
			tx.setBounds(500,200,300,300);
			tx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  tx.setVisible(true);
			 	
		
		 
		 
		 
	
	}
	
	
	
	public static void main(String args[]) {
		new �¼�����();
		
		
	}
	
	
}


