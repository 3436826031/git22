package ��������;

//���󣬷�����
public class duix {

String a;
int b;
static int c=0;//��̬������ȫ�����øı�

int id=0;

duix(int x){
	
id=x;	

}




	public static void main(String arg[]){
		
	System.out.println("��ʼ");
		duix dx;  //��������
		dx=new duix(1);//ʵ����
		dx.a="aaa";
		dx.b=1;
		System.out.println(dx.a+dx.b);
		//----------------------------------
		
		duix dx2=new duix(2);//һ��
		dx2.c++;//��̬���ñ���
		dx.c++;
		System.out.println(dx2.c+"  "+dx.c);
		
		duix xs1=new duix(2);
		duix xs2=new duix(3);
      duix xs3=new duix(4);		
		
	   System.out.println(xs1.id);
	   System.out.println(xs2.id);
     System.out.println(xs3.id);
	  lei.ff("asdsa");//�����������еĺ���
		
	}
		
	
}








class lei{
	
	static void ff(String a){
		System.out.println(a);
		
		
		
	}
	
	
}







