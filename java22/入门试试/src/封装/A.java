package ·â×°;

public class A {
String name;
int age;
B weapon;


public A() {
	
}


public A(String name, int age, B weapon) {
	super();
	this.name = name;
	this.age = age;
	this.weapon = weapon;
	
}

public void shuchu() {
	System.out.println("ĞÕÃû£º"+name +"ÄêÁä"+age+"ÎäÆ÷"+weapon.getCode());
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public B getWeapon() {
	return weapon;
}
public void setWeapon(B weapon) {
	this.weapon = weapon;
}







	
	
	
	
	
	
	
	
}
