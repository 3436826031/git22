package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class BtnClick implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		Object yuan=e.getSource();    //获取事件源（事件产生的组建）
		JButton aj1=(JButton)yuan;    //转型成为自己需要的组建
		System.out.println("单击了"+aj1.getLabel()+"建");
		                    // TODO 自动生成的方法存根
	}
	

}



public class 事件处理{
	
	
	public 事件处理() {
		JFrame tx=new JFrame();
		JButton aj2= new JButton("测试点击1");
		JButton aj3= new JButton("测试点击2");
		JButton aj4= new JButton("5555555555555555555555555");
		JPanel mb=new JPanel();
		

		mb.add(aj2);
		mb.add(aj3);
		mb.add(aj4);
		
		aj2.addActionListener(new BtnClick());
		aj3.addActionListener(new BtnClick());
		
	
		 
		 aj4.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
					Object yuan=e.getSource();    //获取事件源（事件产生的组建）
					JButton aj1=(JButton)yuan;    //转型成为自己需要的组建
					
					System.out.println("单击了"+aj1.getLabel()+"建");
					                    // TODO 自动生成的方法存根
				}

			 
		 });
		 
		 
	
			 
			tx.add(mb);
			tx.setBounds(500,200,300,300);
			tx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  tx.setVisible(true);
			 	
		
		 
		 
		 
	
	}
	
	
	
	public static void main(String args[]) {
		new 事件处理();
		
		
	}
	
	
}


