package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*遍历集合的方法 
  1.把集合转化为数组Object 然后将素组遍历
  2.使用迭代器
*      hasNext()获取还有没没有可迭代的对象
*
*/
public class 迭代器 {
	
	
	
	public static void main(String args[]) {	
		
		
		Collection A=new ArrayList();
		Collection B=new ArrayList();
		
		B.add("一个");

		
		
		A.add("1");
		A.add(2);//集合与数组的区别：集合就可以存储完全不同的数据类型
		A.add(2.3);
		A.add("4");
		//多态          实现类对象
		Iterator dd=A.iterator();//创建迭代器对象
     
		
		Iterator dd2=A.iterator();
		
		
		System.out.println(dd.next());
		System.out.println(dd.next());
		System.out.println(dd.next());
		System.out.println("-------------------");
		
		
		while(dd2.hasNext()) {
			
			System.out.println(dd2.next());
			
		}
		System.out.println("22------------------22");
		
	//	for(int i=0;i<6;i++)
			
	for(Iterator dd3=B.iterator();dd3.hasNext();) {//???????
		
			System.out.println(dd3.next());
			System.out.println("-------------------");
		}
		
		
}
}
