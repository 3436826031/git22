package 唤醒;

public class baozi {
	
	//锁对象就是包子，既两个进程通讯的方法
	//启动这个程序
	boolean flay=false;
	
	public static void main(String args[]) {

		baozi bz=new baozi();//通过另外两个的方法传进去，开启线程
		
		new guke(bz).start();
		
		new baozipu(bz).start();
		
		
		
	}
	
	

	
	

}
