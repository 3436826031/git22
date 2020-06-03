package swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * 要处理按钮事件，就必须继承ActionListener接口，运用复写他的方法
 * 还要在你需要处理事件的那个按键上创建一个监听器
 * 用复写的方法来进行
 * 
 * */


public class swing基础 implements ActionListener{


	
	JButton anj1=new JButton("测试按键");
	JPanel mb=new JPanel();
	JFrame kj=new JFrame("swing基础");
	
	
	
	public swing基础() {	//构建方法  添加组件的命令必须在方法里面

	  kj.setLayout(new GridLayout(2,1));//设置布局
	  mb.add(anj1);
      kj.add(mb,"South");
	  anj1.addActionListener(this);//设置监听器
	   
	  kj.setBounds(500,200,300,300);
	  kj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  kj.setVisible(true);
		 	
	}
	
	
	
	public static void main(String args[]) {
		new swing基础();//创建对象
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {//继承接口的方法：监听方法

		if(e.getSource()==anj1) {//getSource获取组建
		System.out.println("按键1反馈");	
		}
		
	}}
