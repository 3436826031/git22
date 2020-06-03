package zuoye;

public class calculate {
	int a;
	int b;
	 
	public calculate(int a,int b) {
		this.a=a;
		this.b=b;
	
	}
	
	public int add() {
		return a+b;
	}
	
	
	public int mul() {	
		return a*b;
	}
	
	public static void main(String arge[]) {
	calculate js=new calculate(1,2);	
		
	System.out.println(js.add());

	}
	

}
