package 多线程;
/*实现同步的第二种方法：定义一个方法，将共享的数据的实现放入*/
public class 同步实现方法 implements Runnable {
	private int piao=5;
	Object suo=new Object();
	@Override
	public void run() {
      

			  for(int i=0;i<5;i++) {
				 
				ff();
		    	  
		      }		
			
		
	
			
		}
	
			  
	public synchronized void ff(){
		 if(piao>0) {
		       piao--;
			System.out.println(Thread.currentThread().getName()+"票数："+piao);
  	  
		  }
	
			
			
		
		
		
		
	}
	
	

}
