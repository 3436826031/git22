package 唤醒;

public class guke extends Thread{
	
	private baozi bz;
	
	public guke(baozi bz) {
		
		this.bz=bz;	
	}




public void run() {
	
	while(true) {
		
		synchronized (bz){		
			
		//	if(bz.flay==false) {
				
				System.out.println("顾客1要包子");
				
				try {
				bz.wait();
				} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
					e.printStackTrace();
				}	
			//}
			


		System.out.println("顾客1被唤醒，开始吃包子");
		System.out.println("------------------------------------");
		
		bz.flay=false;
   		bz.notify();
   		
   		
		}
		
			
	}
	}


}
