package ����;

public class baozipu extends Thread {

	 baozi bz;//���������룬
	
	public baozipu(baozi bz) {
		this.bz=bz;
	}
	
	
		public void  run(){
			
  while(true) {
			
		synchronized (bz){
		
			//if(bz.flay==false) {
				
				System.out.println("��ʼ������ing.....(5s)");
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				
				//�����ˣ����Ӽȴ���
			//	bz.flay=true;
				bz.notify();
			
			//}
			
			//else {
				
				try {
					bz.wait();
					} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}			
			      }
			
			
			
		//}	
     	}

	}
		
	
	
}


