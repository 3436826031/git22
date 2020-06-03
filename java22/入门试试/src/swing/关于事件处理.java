package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 事件处理，就是用一个类来继承接口ActionListener，因为接口中有事件处理的方法
 * 两种方法实现1.设置一个实现类继承接口，再复写方法，最后在创建实现类的对象来实现
 * 2.直接设置匿名内部类（但这个使用一次比较好）直接创建ActionListener的类对象，并复写接口的方法即可。
 * 
 * 
 * */
class 点击事件 implements ActionListener {//直接创建一个类实现接口
	
	public void actionPerformed(ActionEvent e) { 
		Object yuan=e.getSource();    //获取事件源（事件产生的组建）
		JButton aj1=(JButton)yuan;    //转型成为自己需要的组建
		System.out.println("单击了"+aj1.getLabel()+"建");
		                    // TODO 自动生成的方法存根
	}
	

}





public class 关于事件处理 {
	
	
	public static void main(String args[]) {	
		
		JFrame tx=new JFrame();//设置一个窗口
		tx.setLayout(new FlowLayout());
		JButton aj1=new JButton("我是按键1");
		JButton aj2=new JButton("我是按键1");
		
		
		tx.add(aj1);
		
		tx.add(aj2);
		
		aj1.addActionListener(new 点击事件());//通过实现类类，调用方法
		
		
		
		
		
		aj2.addActionListener(new ActionListener() {   // addActionListener(对象); //直接创建匿名内部类来实现
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				
				System.out.println("我是匿名内部类的方法");
				
			}
		});
				
//通过实现类类，调用方法
		
		
		
		
		
		
		
		
		
		
		tx.setBounds(500,200,300,300);
		tx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  tx.setVisible(true);
		 	
		
	}
	
	
	
	

}
