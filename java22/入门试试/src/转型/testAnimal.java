package 转型;

public class testAnimal {

	public static void main(String args[]) {

		
		Animal a=new cat();
		
		a.eat();
       /* a.dul();  不能用，只能*/	
		
	
		cat ac=(cat)a;
	ac.dul();

		
	}
	
	
	
}
