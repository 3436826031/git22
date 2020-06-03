package 多线程;

public class 同步方法 implements Runnable {
	private int piao=5;
	Object suo=new Object();
	@Override
	public void run() {
             //3333
		/*多条线程进行抢夺Cpu的执行权，类如线程123,1抢到了，就开始执行，但不一定执行到哪，如果中途2抢到了，则2重新开始执行他自己的进程
		 * 然后3抢到了，也会执行他自己到的进程，比如1执行（减号上面）运行到piao--，时被3线程抢到，3自己执行第一句（减号上面），然后又被
		 * 1线程抢到，11执行输出（票数4），线程又被2抢到2执行上面以及piao-
		 * 
		 * 
		 * 就是谁抢到了谁就自己执行自己的
		 * */
	
		
		
			  for(int i=0;i<5;i++) {
				 
				  synchronized(suo) {   
				  if(piao>0) {
				       piao--;
					System.out.println(Thread.currentThread().getName()+"票数："+piao);
		    	  
				  }
				}	  
		    	  
		      }		
			
		
		
	
		
		
		
		
	}
	
	

}
