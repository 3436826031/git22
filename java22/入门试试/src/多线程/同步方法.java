package ���߳�;

public class ͬ������ implements Runnable {
	private int piao=5;
	Object suo=new Object();
	@Override
	public void run() {
             //3333
		/*�����߳̽�������Cpu��ִ��Ȩ�������߳�123,1�����ˣ��Ϳ�ʼִ�У�����һ��ִ�е��ģ������;2�����ˣ���2���¿�ʼִ�����Լ��Ľ���
		 * Ȼ��3�����ˣ�Ҳ��ִ�����Լ����Ľ��̣�����1ִ�У��������棩���е�piao--��ʱ��3�߳�������3�Լ�ִ�е�һ�䣨�������棩��Ȼ���ֱ�
		 * 1�߳�������11ִ�������Ʊ��4�����߳��ֱ�2����2ִ�������Լ�piao-
		 * 
		 * 
		 * ����˭������˭���Լ�ִ���Լ���
		 * */
	
		
		
			  for(int i=0;i<5;i++) {
				 
				  synchronized(suo) {   
				  if(piao>0) {
				       piao--;
					System.out.println(Thread.currentThread().getName()+"Ʊ����"+piao);
		    	  
				  }
				}	  
		    	  
		      }		
			
		
		
	
		
		
		
		
	}
	
	

}
