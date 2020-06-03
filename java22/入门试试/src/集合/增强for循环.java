package 集合;

import java.util.ArrayList;
import java.util.Collection;

public class 增强for循环 {
	//用来遍历数组或集合
	
	public static void main(String[] args) {
		
		
    int a[]={1,2,3,4};
	for(int a1: a) 
	{
		
	   System.out.println(a1);
	}
	
	//
	Collection<String> A=new ArrayList();
	A.add("a");
	A.add("b");
    A.add("c");
    A.add("????");
    //for(集合/数组类型 变量名：集合名/素组名 )
    
	for(String A1: A) 
	{
	   System.out.println(A1);
	}
	
		
	
	}
}
