package ����;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*�������ϵķ��� 
  1.�Ѽ���ת��Ϊ����Object Ȼ���������
  2.ʹ�õ�����
*      hasNext()��ȡ����ûû�пɵ����Ķ���
*
*/
public class ������ {
	
	
	
	public static void main(String args[]) {	
		
		
		Collection A=new ArrayList();
		Collection B=new ArrayList();
		
		B.add("һ��");

		
		
		A.add("1");
		A.add(2);//��������������𣺼��ϾͿ��Դ洢��ȫ��ͬ����������
		A.add(2.3);
		A.add("4");
		//��̬          ʵ�������
		Iterator dd=A.iterator();//��������������
     
		
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
