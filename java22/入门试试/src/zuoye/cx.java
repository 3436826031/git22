package zuoye;

public class cx {
int a;
float b;

	public cx(int a,float b) {
		this.a=a;
		this.b=b;
		
	}
	
	public cx() {
		this.a=2;
		this.b=3.4f;
		
		
	}

	public double add() {
		return a+b;

	}
	
	public static void main(String arge[]) {
		cx a=new cx(5,5);
		System.out.println(a.add());
		cx a2=new cx();
		System.out.println(a2.add());
		
	}
	
	
	
	
}
