package xx����;

import java.util.Scanner;

public class ����1 {

	
	public static void main(String args[]) {
		
		
		System.out.println((float)(5%3));
	
		byte a;
		int b=128;
		a=(byte)b;
		double c=0.6f;
		
		
		char d='c';//�Զ�ת��Ϊassii�룬���мӼ�
		System.out.println(c);
		System.out.println(b+d);
		
		int a1=3;
		int b1=a1++;//b1=  a1=a1+1
		int c1=4;
		System.out.println(a1);//����4
		System.out.println(a1=c1);//ֱ�Ӹ�ֵ����c1��ֵ��a1
		
		
		
		int  cj;int cj2;
		Scanner sc=new Scanner(System.in);//s����. 
		cj=sc.nextInt();
		cj2=sc.nextInt();
		System.out.println(cj);
		
		
		int a3=0;
		
		while(a3<9) {
			a3++;
			System.out.println(a3);
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
