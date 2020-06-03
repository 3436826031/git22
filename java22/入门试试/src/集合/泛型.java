package 集合;

public class 泛型 {
	
	
	
	public static void main(String[] args) {
		泛型 fx=new 泛型();
		fx.a("2222222");//创建对象传递的是什么数据类型就是什么数据类型
		fx.a(11111);
		fx.a(3.14);
		
		

	}
	
	
	//泛型方法，在调用方法时确定泛型的数据类型
	
	
	public <f> void a(f s) {//泛型方法
		
		System.out.println(s);
		
	}
	
	//泛型的静态方法：静态方法可以不用创建对象，直接使用 类名.方法名
	
	

}
