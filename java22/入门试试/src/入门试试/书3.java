package ��������;
//�ӿ�
import com.bao.bao;
public class ��3 {
	
	/*public String  toString() {
		return "���Ƿ���" + getClass().getName()+ "   222 ";
	}*/

	
public static void main(String args[]) {

	String b1="123";
	String b2="123";
	
	System.out.println(b1.equals(b2));
	
	��3 a=new ��3();
	
	��3 b=new ��3();
	new ��3();
	System.out.println(b1.equals(b2));
	
	
	System.out.println("���"+Math.cos(0));//��ѧ����
	System.out.println("�����"+(int)(Math.random()));//�����+ǿ����ת��
	
	
	System.out.println("�����2:  "+sjs(1,6));//�����+ǿ����ת��
	
	System.out.println("��ĸ�����"+(char)('a'+Math.random()*26));//�����+ǿ����ת��

                 
}	


public static  int sjs(int a,int b) {
	
	int shu= a+   (int)( Math.random()*(b-a) );
	int shu2= a+   (int) Math.random()*(b-a) ;
	
	return shu;
}




}
