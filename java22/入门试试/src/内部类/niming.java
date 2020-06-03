package 内部类;

public class niming {
	
	//两种实现方法（其实就是一种，嘻嘻嘻）
	
	public static void main(String args[]) {
		
	jiek a=new jiek() {//匿名内部类  
		@Override
			public void chat() {	
				System.out.println("匿名内部类");
				
			}
				
		} ;
		
		
		
		a.chat();
		
		
		
		
		
		new jiek() {

			@Override
			public void chat() {
		
				
				System.out.println("匿名内部类22");
				
			}
			
			
			
			
		}.chat();
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
