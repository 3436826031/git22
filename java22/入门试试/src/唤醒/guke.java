package ����;

public class guke extends Thread{
	
	private baozi bz;
	
	public guke(baozi bz) {
		
		this.bz=bz;	
	}




public void run() {
	
	while(true) {
		
		synchronized (bz){		
			
		//	if(bz.flay==false) {
				
				System.out.println("�˿�1Ҫ����");
				
				try {
				bz.wait();
				} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}	
			//}
			


		System.out.println("�˿�1�����ѣ���ʼ�԰���");
		System.out.println("------------------------------------");
		
		bz.flay=false;
   		bz.notify();
   		
   		
		}
		
			
	}
	}


}
