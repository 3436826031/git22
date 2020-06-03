package xx入门;

public class 入门2 {
	double chang;
	double kuan;
	double gao;//成员变量
	
	public 入门2(double chang,double b,double c) {//构造方法
		this.chang=chang;//成员变量this'
		kuan=b;
		gao=c;
	}
	
	
	public double tiji() {//方法	
		return chang*kuan*gao;	
	}
	public void output(){
		System.out.println(tiji());
	}
	
	
	public static void main(String args[]) {
		
		入门2 duix=new 入门2(1,2,1);
		/*duix.chang=1;
		duix.kuan=2;
		duix.gao=1;*/

		//System.out.println("体积"+duix.tiji());
   duix.output();

   }

}
















 /*class box{//类
	
	double chang;
	double kuan;
	double gao;//成员变量
	
	
	public double tiji() {//方法	
		return chang*kuan*gao;	
	}
	
	
	public static void main(String args[]) {
		
		box duix=new box();
		duix.chang=1;
		duix.kuan=2;
		duix.gao=1;
		System.out.println("体积"+duix.tiji());
				
		
		
		
	}
	
	
	
}*/