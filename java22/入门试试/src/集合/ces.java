package ����;

import java.util.ArrayList;
import java.util.Collection;

public class ces {

	
	public static void main(String args[]) {	
		
		Collection<String> A=new ArrayList<>();
		System.out.println(A);
		
		
		boolean B=A.add("zz");//����Ԫ��
		System.out.println(B);
		System.out.println(A);
		A.add("11");
		A.add("22");
	    A.add("33");
	    System.out.println(A);
	    System.out.println("----------------");
	    boolean C=A.remove("11");
	    System.out.println(C);
	    System.out.println(A);
	}
	
	
	
	
	
	
	
	
	
}
