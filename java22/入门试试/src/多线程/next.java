package 多线程;

public class next {
	
	
 public static void main(String args[]) {
	 
	 
	 实验1 A=new 实验1();
	 
	 Thread A1=new Thread(A);
	 
         //  实验1 B=new 实验1();
	 Thread B1=new Thread(A);
	 
        //  实验1 C=new 实验1(); 
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
