package zuoye;

/*编写一个类A，该类创建的对象可以调用方法f输出小写的英文字母表。然
后再编写一个A类的子类B，要求子类B必须继承类A的方法f（不允许重写），
子类B创建的对象不仅可以调用方法f输出小写的英文字母表，而且可以调用子
类新增的方法g输出大写的英文字母表。最后编写主类C，在主类的main方法
中测试类A与类B。
*/

public class B extends A{
	
	
	public void g(){
		System.out.print(" 子类的大写 ");
		for(char n='A';n<'Z';n++) {
			System.out.print(n+"  ");
			
			
			
			
			
			
		}
		
		
		
		
	}
	
	
	

}
