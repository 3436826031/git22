package ���������;

import java.io.File;

public class ���� {//�ȱ����ļ��У����ļ���ȡ������������String����

 public static void main(String[] args) {
	 File wj=new File("E:\\File"); 
		dg(wj);
	 
}
	
 
 
 
public static void dg(File wj2) {
	
	for(File A:wj2.listFiles()) {
		
		if(A.isDirectory()) {
			dg(A);//������ļ��о͵ݹ�����ִ��
			
		}
		
		else {//����������ļ�
			
			
			String A2=A.getPath();//���ļ�����ת��Ϊ�ַ������󣬲ſ��Ե����䷽��
			A2=A2.toLowerCase();//��չ���� �����д�дת��ΪСд�������Ϳ���
			
			
		  if(A2.endsWith(".ppt")) {//endsWith�Աȷ������Ա���չ������������ӡ
			  
			  System.out.println(A);
			  
		  }
			
			
			
			
		}
		

	}
	
	
	
}
}

