package ���߳�;

public class B extends Thread {
	
	
	
	
	Thread a=Thread.currentThread();
	
	@Override
	public String toString() {
		return "asds";
	}
	public void run() {
		
		
		for(int i=0;i<10;i++) {
			System.out.println("   "+i);
		try {
		Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		}
		
		
		System.out.println("   "+a);
		System.out.println(Thread.currentThread().getName());

	/*	for(int i=0;i<5;i++) {
			
		System.out.println("run"+">>>"+i);
			
			
		}*/
		
	}
	

}
