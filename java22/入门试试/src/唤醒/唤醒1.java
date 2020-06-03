package 唤醒;

public class 唤醒1 {
	
	
	public static void main(String args[]) {

	Object suo=new Object();
	String a=new String("a");
	String b=new String("a");
	
	
	if(a==b)
	{
		System.out.println("aaaa");
	}
	
	
	new Thread(){//顾客的方法
		
		public void run() {
			
			synchronized (suo){
			
		
			
			System.out.println("要包子");
			
			try {
			suo.wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			
			System.out.println("被唤醒");
			
			
			
			}
			
			
			
			
			
		}
		
		
		
	}.start();
	
     new Thread(){//老板
	public void    run(){
		
		synchronized (suo){
			System.out.println("做包子ing");
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("做包子ing");
			suo.notify();
			System.out.println("被唤醒了也要执行");
		}
		
		
	}	
			
		
		
	}.start();
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
