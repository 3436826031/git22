package ����;

import java.util.ArrayList;

public class ces2 {
	
	public static void main(String args[]) {	
	
	
	ArrayList A=new ArrayList();
	
	A.add("1");
	A.add(2.3);
	A.add("3");
	 System.out.println(A);
	 System.out.println("-------�������-------");
	 Object[] B= A.toArray();
	 
	 for(int i=0;i<B.length;i++) {
		 
		 System.out.println(B[i]);
	 }
	 
	 System.out.println("-------���ϱ���-------");
	 
	 
	 for(int i=0;i<A.size();i++) {
		 
		 System.out.println(A.get(i));
		 
	 }
	 
	
	}

}
