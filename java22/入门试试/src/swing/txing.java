package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class txing extends JFrame{              //�̳�JFrame��
	//JButton aj1;
	JPanel mb; 
	JTextField shur;
	//����һ����������
	//JLabel tx=new JLabel();
	
	txing(String title){                         //���췽��
	    super(title);                               //���ø���  
 
	 JButton aj1=new JButton("����һ����ť");              //��һ�ַ���������������
	 mb=new JPanel();  
	 shur=new JTextField("�����");
	 
	 mb.add(aj1);                               //ba==�Ѱ�ť���a������ϣ��ٽ������ӵ��齨��
	 mb.add(shur);
	 
	 this.add(mb);
	 
	 super.setSize(300, 200);
	 this.setLocation(200,200);
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.setVisible(true);
		
	}
	
	
	public void setSize(int a,int b) {
		
		System.out.println("hhha");
		
	}
	
	public static void main(String args[]) {
	
		new txing("���Ǳ���");
		
	}
	
}
