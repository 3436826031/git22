package zuoye;

import java.util.Scanner;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class zy14 extends JFrame implements ActionListener{

	JButton jb1=new JButton("ȷ��");
	JButton jb2=new JButton("ȡ��");
	JLabel labName=new JLabel("����");
	JLabel labPwd=new JLabel("����");
	JTextField txtName=new JTextField(20);
	JPasswordField txtPwd=new JPasswordField(20);
	
	JPanel jp1=new JPanel();
	JPanel jp2=new JPanel();
	JPanel jp3=new JPanel();
	JPanel jp4=new JPanel();

	public  zy14(String title){
		super(title);
		jp3.add(labName);
		jp3.add(txtName);
		
		jp4.add(labPwd);
		jp4.add(txtPwd);
		
		jp1.setBorder(BorderFactory.createTitledBorder("��¼"));
		jp1.setLayout(new GridLayout(2,1));
		
		jp1.add(jp3);
		jp1.add(jp4);
		
		jp2.add(jb1);
		jp2.add(jb2);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		this.add(jp2,"South");
		this.add(jp1);

		this.setSize(300,200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
		
	}


	public static void main(String arge[]) {
		new zy14("��¼");
		
		}


	@Override
	
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==jb1) {
		String name=txtName.getText();
		String pass=txtPwd.getText();
		if(name.equals("admint")&&pass.equals("132")) {
			
			//System.out.println("�ɹ�");
			JOptionPane.showMessageDialog(this, "��¼�ɹ�");
		}
		else
			//System.out.println("ʧ��");
		///JOptionPane.showMessageDialog(this, "��¼ʧ��");
		JOptionPane.showMessageDialog(this, "��¼ʧ��","����",JOptionPane.ERROR_MESSAGE);
	}
	
	if(e.getSource()==jb2) {
		System.exit(0);
		
		
	}
		
	}
	
	
	
	}












