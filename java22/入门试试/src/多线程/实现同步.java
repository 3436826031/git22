package ���߳�;

public class ʵ��ͬ�� {
	
	
	
 public static void main(String args[]) {
	 
	 
	ͬ������ A=new ͬ������();
	ͬ��ʵ�ַ��� B=new ͬ��ʵ�ַ���();
	
	 
	 Thread A1=new Thread(A);
	 Thread B1=new Thread(A);
	 Thread C1=new Thread(A);
	 

	 A1.start();
	 B1.start();
	 C1.start();
	
	 
	 
	 Thread A2=new Thread(B);
	 Thread B2=new Thread(B);
	 Thread C2=new Thread(B);
	 A2.start();
	 B2.start();
	 C2.start();
	
	 
	 
	 
 }
}
