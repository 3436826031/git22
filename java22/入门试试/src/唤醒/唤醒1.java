package ����;

public class ����1 {
	
	
	public static void main(String args[]) {

	Object suo=new Object();
	String a=new String("a");
	String b=new String("a");
	
	
	if(a==b)
	{
		System.out.println("aaaa");
	}
	
	
	new Thread(){//�˿͵ķ���
		
		public void run() {
			
			synchronized (suo){
			
		
			
			System.out.println("Ҫ����");
			
			try {
			suo.wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
			
			System.out.println("������");
			
			
			
			}
			
			
			
			
			
		}
		
		
		
	}.start();
	
     new Thread(){//�ϰ�
	public void    run(){
		
		synchronized (suo){
			System.out.println("������ing");
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println("������ing");
			suo.notify();
			System.out.println("��������ҲҪִ��");
		}
		
		
	}	
			
		
		
	}.start();
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
