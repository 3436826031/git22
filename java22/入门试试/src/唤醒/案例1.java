package ����;

public class ����1 {
	static boolean baozi=false;
		 
	   
	
		public static void main(String args[]) {

		Object suo1=new Object();
	
		

		
		new Thread(){//�˿͵ķ���
			
			public void run() {

				
				while(true) {
					
					
				synchronized (suo1){		
					
				System.out.println("�˿�1Ҫ����");
				
				try {
				suo1.wait();
				} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
		
		
				System.out.println("�˿�1�����ѣ���ʼ�԰���");
		   		
				}
				
				}
					
				
			}
			
			
			
		}.start();
		
	     new Thread(){//�ϰ�
		public void    run(){
			
			
			while(true) {
				
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			
			synchronized (suo1){
				
			
				
				suo1.notify();
				System.out.println("����������");

			
				
		
			}
			}
			
			
		}	
				
			
			
		}.start();
		
		
		
		
		
		
		

		
		
		
		
		

	}

}
