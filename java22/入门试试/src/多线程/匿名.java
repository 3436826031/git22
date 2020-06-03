package 多线程;

public class 匿名 {

	
	public static void main(String args[]) {
	
	
	
	new Thread() {
		
	public void run(){
		
			
			System.out.println("匿名内部类直接设置多线程");  
			//设置多线程就是，子类继承一个Thread类，然后重写run（）方法，再来一个实现类，创建Thread的对象，最后调用start方法开始线程
			
		}
		
	}.start();
	
	
	}
	
	
}
