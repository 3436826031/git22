package ���߳�;

public class next {
	
	
 public static void main(String args[]) {
	 
	 
	 ʵ��1 A=new ʵ��1();
	 
	 Thread A1=new Thread(A);
	 
         //  ʵ��1 B=new ʵ��1();
	 Thread B1=new Thread(A);
	 
        //  ʵ��1 C=new ʵ��1(); 
	 Thread C1 =new Thread(A);
	 

	 A1.start();
	 B1.start();
	 C1.start();
	
	 
	 
	 
	/* A1.run();
	 B1.run();
	 C1.run();
	 
	*/ 
 }
	
	

}
