package zuoye;

import java.util.Scanner;

/*1.����һ�������벻��ͨ�õļ��㹫ʽ��BMI������ָ���������أ����������ߣ��ף���ƽ����BMI��18��25��������Χ��
 * ����25Ϊ���أ�����30Ϊ��ȷ��֣�����35Ϊ�жȷ��֣�����40Ϊ�ضȷ��֡���дһ������ʵ���û��������غ���ߣ���ʾ���������

*/
public class zy {

	int BMI;
	
Scanner sc = new Scanner(System.in);
Scanner sc2 = new Scanner(System.in);
	int tz = sc.nextInt();
	int sg=sc2.nextInt();
	
	
	
	public void BMI(int tz,int sg) {
BMI=	tz/sg*sg;	
	}
	

	

	
	
	if(18<BMI<25) {
		System.out.println("������Χ");
		
	}
	
	else if(25<BMI<30) {
		
		System.out.println("����");
	}
	
	else if(50<BMI) {
		
		
		
	}
	
	
	
}
