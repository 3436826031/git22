package jisq;

public class fz {

	
	public static void main(String args[]) {
		
		A a=new A();
		a.setname("123");

		System.out.println(a.duq());
		
	} 
	
}
	
	
	
	class A {
		
		private String name;//ÀΩ”– Ù–‘
		private int age;

		public void setname(String name) {
			this.name=name;
		}
		
		public String duq() {
			return name;
			
		}
		
		
		
		
	}

	
	
	
	
	
	
	




