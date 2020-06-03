package 入门试试;
/*三.方法覆写
概念： 子类定义了与父类方法名称，返回值类型、参数类型及个数完全相同的方法。

在进行覆写操作时应当关注以下两点：
你当前使用的对象是通过哪个类new的。
当你调用某个方法，如果该方法已经被子类所覆写了，那么调用的一定就是被覆写过的方法*/



public class 方法的复写 {
	
	void fx() {
		System.out.println("111111111111");
	}
	
	
	public static void main(String [] args) {
		
		复写2 qwxz=new 复写2();//实例化
		方法的重载 qwxw=new 方法的重载();
		
		qwxz.fx();//调用函数
	}
		

}



class 复写2 extends 方法的复写{
	
	void fx() {
System.out.println("22222222222");
super.fx();//跳过
		
	}
	
}



class 方法的重载 {
	

	
	方法的重载(){	
	重载(1);
	重载();
	重载(1,2);	
	}
	
	public static  void 重载() {	
		System.out.println("没有");
	}
	public static void 重载(int a) {
		System.out.println("只有a");
	}
	
	void 重载(int a,int b) {
		System.out.println("a和b");
	}
	
	
	public static void main(String [] args) {
		
		
		System.out.println("3333");
		
	}
	

}










