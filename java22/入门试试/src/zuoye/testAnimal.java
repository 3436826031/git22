package zuoye;

public class testAnimal {
	
	public void play(Animal d) {
		
		d.say();
	}
	
	
	public static void main(String args[]) {
		testAnimal a=new testAnimal();
		
		
		
		Dog c=new Dog("1","ci",16,"666");
		a.play(c);
		Animal c1=new Dog();
	c1.say();
		cat e=new cat("2","ss",20,"888");
		
		a.play(e);
		
		
	}
	

}
