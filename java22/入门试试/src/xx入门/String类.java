package xx����;

public class String�� {

	
	
	public static void main(String[] args) {
	
	
	char ac[]= {'a','c','d','1'};
	
	
	String a=new String(ac);
	String b=new String("  dierge");
	String c=new String("  ��");
	
	
	StringBuffer d=new StringBuffer(a);
	d.append("45");
	
	
	System.out.println(a);
	System.out.println(a+b);
	System.out.println(" StringBuffer��"+d);
	}
	
	
	
}
