package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class txing extends JFrame{              //继承JFrame类
	//JButton aj1;
	JPanel mb; 
	JTextField shur;
	//建立一个面板的引用
	//JLabel tx=new JLabel();
	
	txing(String title){                         //构造方法
	    super(title);                               //引用父类  
 
	 JButton aj1=new JButton("这是一个按钮");              //另一种方法构建按键对象
	 mb=new JPanel();  
	 shur=new JTextField("输入框");
	 
	 mb.add(aj1);                               //ba==把按钮添加a到面板上，再将面板添加到组建中
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
	
		new txing("这是标题");
		
	}
	
}
