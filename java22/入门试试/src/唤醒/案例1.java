package 唤醒;

public class 案例1 {
	static boolean baozi=false;
		 
	   
	
		public static void main(String args[]) {

		Object suo1=new Object();
	
		

		
		new Thread(){//顾客的方法
			
			public void run() {

				
				while(true) {
					
					
				synchronized (suo1){		
					
				System.out.println("顾客1要包子");
				
				try {
				suo1.wait();
				} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
		
		
				System.out.println("顾客1被唤醒，开始吃包子");
		   		
				}
				
				}
					
				
			}
			
			
			
		}.start();
		
	     new Thread(){//老板
		public void    run(){
			
			
			while(true) {
				
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			
			synchronized (suo1){
				
			
				
				suo1.notify();
				System.out.println("包子做好了");

			
				
		
			}
			}
			
			
		}	
				
			
			
		}.start();
		
		
		
		
		
		
		

		
		
		
		
		

	}

}
