package 入门试试;

public class 构建方法 {
	final static int jt=6;  //final 静态的，不可改变，常量
	static int bl=56;   
	int a;

	public static void main(String args[]) {
    构建方法 d=new 构建方法();	
	}
	
	public 构建方法()  {	
	this(6);
	System.out.println("21212");
	}
	
	
	public 构建方法(int a) {
	this.a=a;
	a=11;
	System.out.println(this.a);
		
	}
	
	
}





















/*class lei22{
	public static void main(String args[]) {
		System.out.println();
		}
	
	
	
}*/




