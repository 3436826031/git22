package swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Ҫ����ť�¼����ͱ���̳�ActionListener�ӿڣ����ø�д���ķ���
 * ��Ҫ������Ҫ�����¼����Ǹ������ϴ���һ��������
 * �ø�д�ķ���������
 * 
 * */


public class swing���� implements ActionListener{


	
	JButton anj1=new JButton("���԰���");
	JPanel mb=new JPanel();
	JFrame kj=new JFrame("swing����");
	
	
	
	public swing����() {	//��������  ����������������ڷ�������

	  kj.setLayout(new GridLayout(2,1));//���ò���
	  mb.add(anj1);
      kj.add(mb,"South");
	  anj1.addActionListener(this);//���ü�����
	   
	  kj.setBounds(500,200,300,300);
	  kj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  kj.setVisible(true);
		 	
	}
	
	
	
	public static void main(String args[]) {
		new swing����();//��������
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {//�̳нӿڵķ�������������

		if(e.getSource()==anj1) {//getSource��ȡ�齨
		System.out.println("����1����");	
		}
		
	}}
