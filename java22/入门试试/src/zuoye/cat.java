package zuoye;

public class cat extends Animal {

	String name;

	public cat(String type, String sex, int age, String name) {
		super(type, sex, age);
		this.name = name;
	}
	
	public void say() {
		
		System.out.println("ίχίχίχ");
		
	}
	
	
	
}
