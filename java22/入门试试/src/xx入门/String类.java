package xx入门;

public class String类 {

	
	
	public static void main(String[] args) {
	
	
	char ac[]= {'a','c','d','1'};
	
	
	String a=new String(ac);
	String b=new String("  dierge");
	String c=new String("  三");
	
	
	StringBuffer d=new StringBuffer(a);
	d.append("45");
	
	
	System.out.println(a);
	System.out.println(a+b);
	System.out.println(" StringBuffer类"+d);
	}
	
	
	
}
