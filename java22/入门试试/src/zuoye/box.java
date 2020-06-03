package zuoye;



public class box {
	double chang;
	double kuan;
	double gao;//成员变量
	
	public box(double chang,double kuan,double gao) {//构造方法
		/*this.chang=chang;//成员变量this'
		this.kuan=kuan;*/
		this(chang,kuan);
		
		this.gao=gao;
	}
	public box(double chang) {//构造方法
		this.chang=chang;
	
	}
	public box(double chang,double kuan) {//构造方法
		this.chang=chang;
		this.kuan=kuan;
	}
	
	public double tiji() {//方法	
		return chang*kuan*gao;	
	}
	public void output(){
		System.out.println(tiji());
	}
	
	
	public static void main(String args[]) {
		
		box duix=new box(1,2,1);
		
		duix.output();
		
		
		
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