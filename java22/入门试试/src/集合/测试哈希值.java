package 集合;

public class 测试哈希值 {

	
	

	public static void main(String[] args) {
		
	哈希值 p1=new 哈希值();
	哈希值 p2=new 哈希值();
	哈希值 p3=new 哈希值();
	哈希值 p4=new 哈希值();
	int a=p1.hashCode();
	System.out.println(a);
	System.out.println(p2.hashCode());
	System.out.println(p2.hashCode());
	System.out.println(p3.hashCode());
	System.out.println(p4.hashCode());
	System.out.println("1221".hashCode());
	System.out.println("121212".hashCode());
	System.out.println("1212112123213".hashCode());
	System.out.println("12132323".hashCode());
	
	System.out.println("21".hashCode());
	System.out.println("122".hashCode());
	System.out.println("1112123213".hashCode());
	System.out.println("2323".hashCode());
	
	
	System.out.println("1221212".hashCode());
	System.out.println("121278612".hashCode());
	System.out.println("121211678902123213".hashCode());
	System.out.println("12132398023".hashCode());
	System.out.println("1298021".hashCode());
	System.out.println("1212712".hashCode());
	System.out.println("125712112123213".hashCode());
	System.out.println("12565132323".hashCode());
	}
	
}
