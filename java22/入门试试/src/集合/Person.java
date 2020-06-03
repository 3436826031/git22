package 集合;

import java.util.HashSet;
import java.util.Set;

public class Person extends Object{
	

	public static void main(String args[]) {	
		
		
		Set<String> set=new HashSet<>();
		
		String A1="aaa";
		String A2=new String("bbb");
		
		set.add(A1);
		set.add(A2);
		set.add("重地");
		System.out.println(set);
		
		
	
	
		
		
		
	
	}

}
