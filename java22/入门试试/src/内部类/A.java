package 内部类;

public class A {

	
	public static void main(String args[]) {
		
		B sz=new B("张三");
		sz=new B("222");//地址其实变了
		
		final B sz2=new B("李四");
		sz2.setName("1545");
		
		
		
		
		
		
		System.out.println(sz.getName());
		System.out.println(sz2.getName());
		
	}
	
	
	
	
	
	
	
	
}
