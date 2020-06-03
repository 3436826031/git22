package zuoye;

public class Dog extends Animal {
	
	String name;

	public Dog(String type, String sex, int age, String name) {
		super(type, sex, age);
		this.name = name;
	}


	public Dog() {
		System.out.println("����ķ���");
	}
	
	
	public void watch(){
		
		System.out.println("xiaogouxgou");
	}
	
	
	
	public void say() {
		
		System.out.print("����������        ");
		
	}
	
	public String show() {
		
		super.show();
		return "����"+name;
	}
	
	public static void main(String[] args) {
		Dog d=new Dog("ggou","����",6,"hha");
		d.age=6;
		d.say();
		d.watch();
		
		System.out.println(d.show());
		
	}
	
	
	

}
