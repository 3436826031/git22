package zuoye;

public class Animal {



	String type;
	String sex;
	int age;

	
	
	public Animal(String type, String sex, int age) {
		
		this.type = type;
		this.sex = sex;
		this.age = age;
	}

	public Animal() {
		System.out.println("父类的构造方法");
		
		
	}
	
	public void say() {
		
		System.out.print("一般都能叫");
		
	}
	
	
	public void run() {
		
		System.out.print("一般都能运动");
		
	}
	
	
	public String show() {
		System.out.println("该动物为"+type+"类.今年"+age+"岁 "+sex);
		return "该动物为"+type+"类.今年"+age+"岁 "+sex;
	}
	
	
	
	
}
