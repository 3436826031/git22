package ����;


import java.util.ArrayList;
import java.util.List;

public class List���� {
	
	public static void main(String args[]) {	
		List <String> list=new ArrayList<>();
		//��̬����������ָ���������ʵ���ࣩ�����󷽷������Լ��ĸ�д�����û�У��͵��ø���ķ���
		//list���ϵ��ص㣺�����ԣ�������������������
		/*
		 * public void add��int index,E element�����ƶ�Ԫ����ӵ�ָ����λ����
		 * public E remove ��int index���Ƴ�ָ�������ϵ�Ԫ��
		 * public E set��int index,E element���滻ָ��Ԫ��
		 * */
	list.add("1");
	list.add("2");
	list.add("3");
	list.add("4");
	System.out.println(list);
	list.add(1, "ֱ���������");
	System.out.println("�ڶ��Σ�   "+list);
	String yc=list.remove(0);
	System.out.println("������ ��     "+list);
	
	
		String th=list.set(3, "�滻��");
		System.out.println("���Ĵ� ��     "+list);
		
	
	}
	

}
