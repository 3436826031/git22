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
		System.out.println("����Ĺ��췽��");
		
		
	}
	
	public void say() {
		
		System.out.print("һ�㶼�ܽ�");
		
	}
	
	
	public void run() {
		
		System.out.print("һ�㶼���˶�");
		
	}
	
	
	public String show() {
		System.out.println("�ö���Ϊ"+type+"��.����"+age+"�� "+sex);
		return "�ö���Ϊ"+type+"��.����"+age+"�� "+sex;
	}
	
	
	
	
}
