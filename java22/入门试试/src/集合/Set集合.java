package ����;
/*Set���ϵ��ص�
 * ���ܴ����ظ���
 * û������,����Ҳ������forѭ����������
 * �ײ��Ǹ���ϣ��
 * HashSet��ʵ����Set�ӿ�
 * 
 * */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set���� {

	
	public static void main(String args[]) {	
		
		
		Set<Integer> set=new HashSet<>();
		
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(1);
		
		//û������������ֻ�ܵ���������ǿfor
		
		Iterator<Integer> dd=set.iterator();
		
		while(dd.hasNext()) {
			
			System.out.println(dd.next());
			
			
			
		}
				
		
		
	}
	
	
	
	

}
