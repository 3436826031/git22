package zuoye;

public class zi extends fu{
	
	
	//this是本类的调用，而super是对父类的调用，包括方法，变量，构造
	
	int a=20;
	
	
	
	
	public void a(){
		super.b();
		System.out.println("子类方法");	
		System.out.println(this.a);	
	}
	
	
	public void a(int c) {
		
		this.a();
		System.out.println("调用本类的其他方法");
	}
	

}
