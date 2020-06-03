package 集合;


import java.util.ArrayList;
import java.util.List;

public class List集合 {
	
	public static void main(String args[]) {	
		List <String> list=new ArrayList<>();
		//多态：父类引用指向子类对象（实现类），对象方法调用自己的复写，如果没有，就调用父类的方法
		//list集合的特点：有序性，有索引，其他方法：
		/*
		 * public void add（int index,E element）将制定元素添加到指定的位置上
		 * public E remove （int index）移除指定索引上的元素
		 * public E set（int index,E element）替换指定元素
		 * */
	list.add("1");
	list.add("2");
	list.add("3");
	list.add("4");
	System.out.println(list);
	list.add(1, "直接添加索引");
	System.out.println("第二次：   "+list);
	String yc=list.remove(0);
	System.out.println("第三次 ：     "+list);
	
	
		String th=list.set(3, "替换了");
		System.out.println("第四次 ：     "+list);
		
	
	}
	

}
