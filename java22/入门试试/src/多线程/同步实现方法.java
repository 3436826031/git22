package ���߳�;
/*ʵ��ͬ���ĵڶ��ַ���������һ������������������ݵ�ʵ�ַ���*/
public class ͬ��ʵ�ַ��� implements Runnable {
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
			System.out.println(Thread.currentThread().getName()+"Ʊ����"+piao);
  	  
		  }
	
			
			
		
		
		
		
	}
	
	

}
