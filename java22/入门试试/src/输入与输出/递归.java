package ���������;
/*
 �ݹ�����Լ������Լ�
  
  main����{
     a();}
 
 a(){
 a()
 }

 * 
 * */

//����1--n
/*
   ����һ������,ʹ�õݹ����1-n֮��ĺ�
    1+2+3+.. .+n
      ���Ե������룬�������н���������  n+(n-1)+(n-2)+...+1
      ��֪:���ֵ:n  ��Сֵ:1

 * */
public class �ݹ� {
	
	public static void main(String[] args)  {
		
		sum(3);
		System.out.println(sum(3));
		jc(3);
		System.out.println(jc(4));
	}
	



/*
ʹ�õݹ������ȷ:
1. �ݹ�Ľ�������
��ȡ��1��ʱ�����

2.�ݹ��Ŀ��
��ȡ��һ�����ӵ�����(n-1)

 * */
	private static int sum(int i) {
		
	if(i==1) {                                            //1. �ݹ�Ľ�������
		return 1;	
        }
		
		return i + sum(i-1);

	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
private static int  jc(int i) {
	if(i==1) {
		return 1;
		
	}	
	
	return i*jc(i-1);
	
		
	}
	
	
	
	
	
	
		

}
