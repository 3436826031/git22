package 多线程;

public class 匿名抽象 {
	
	
	/*匿名多线程的本质，A(实现类)继承抽象类runnable，重写run（）方法，创建A的对象，（可以通过匿名类直接创建一个对象）在创建Thread的对象，
	 * 使用Thread（继承runnable的对象）方法，将Thread（A），再用对象实现run方法*/
	public static void main(String args[]) {
	Runnable A=new Runnable(){         //需要传输对象，所以必须要有引用
		public void run(){
			
			System.out.println("匿名内部类----抽象");
				
		}
		
	};
	
	
	
	new Thread(A).start();
	
	
	
		
	}
	

}
