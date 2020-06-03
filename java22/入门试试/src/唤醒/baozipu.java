package 唤醒;

public class baozipu extends Thread {

	 baozi bz;//将锁对象传入，
	
	public baozipu(baozi bz) {
		this.bz=bz;
	}
	
	
		public void  run(){
			
  while(true) {
			
		synchronized (bz){
		
			//if(bz.flay==false) {
				
				System.out.println("开始做包子ing.....(5s)");
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				
				//做完了，包子既存在
			//	bz.flay=true;
				bz.notify();
			
			//}
			
			//else {
				
				try {
					bz.wait();
					} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
						e.printStackTrace();
					}			
			      }
			
			
			
		//}	
     	}

	}
		
	
	
}


