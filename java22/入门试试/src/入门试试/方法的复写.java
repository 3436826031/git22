package ��������;
/*��.������д
��� ���ඨ�����븸�෽�����ƣ�����ֵ���͡��������ͼ�������ȫ��ͬ�ķ�����

�ڽ��и�д����ʱӦ����ע�������㣺
�㵱ǰʹ�õĶ�����ͨ���ĸ���new�ġ�
�������ĳ������������÷����Ѿ�����������д�ˣ���ô���õ�һ�����Ǳ���д���ķ���*/



public class �����ĸ�д {
	
	void fx() {
		System.out.println("111111111111");
	}
	
	
	public static void main(String [] args) {
		
		��д2 qwxz=new ��д2();//ʵ����
		���������� qwxw=new ����������();
		
		qwxz.fx();//���ú���
	}
		

}



class ��д2 extends �����ĸ�д{
	
	void fx() {
System.out.println("22222222222");
super.fx();//����
		
	}
	
}



class ���������� {
	

	
	����������(){	
	����(1);
	����();
	����(1,2);	
	}
	
	public static  void ����() {	
		System.out.println("û��");
	}
	public static void ����(int a) {
		System.out.println("ֻ��a");
	}
	
	void ����(int a,int b) {
		System.out.println("a��b");
	}
	
	
	public static void main(String [] args) {
		
		
		System.out.println("3333");
		
	}
	

}










