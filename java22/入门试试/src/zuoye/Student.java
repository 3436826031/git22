package zuoye;


public class Student
{
		String sex;
		String name;
		int age;
	public Student(String sex, String name, int age) {
			this.sex = sex;
			this.name = name;
			this.age = age;
		}


		public void showInfo(){
		System.out.println("����:"+name+"�Ա�:"+sex+"����"+age);
		}

}
