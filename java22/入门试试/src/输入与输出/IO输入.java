package ���������;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import com.sun.tools.javac.code.Attribute.Array;

public class IO���� {
	/*
	           �� FilterInputStream
	 -----int read() ��ȡ�����ַ�            ---------------------
	 -----int read(byte[])���ַ�����ַ�---------------------
	 
	          ���췽��
	       FileInputStream(File file) 
           FileInputStream(String name) 

	 */
	
	
	public static void main(String[] args) throws IOException {
		FileInputStream dur = new FileInputStream("E:\\File\\��ȡ.txt");
		//FileOutputStream xie=new FileOutputStream("E:\\File\\��ȡ.txt");
		FileInputStream dur2 = new FileInputStream("E:\\File\\��ȡ2.txt");//�ı�����:EFGH
		byte[] B=new byte[3];//���ֽڶ�ȡ
		
		int B2=dur2.read(B);//����ֻ������������Ч��������
	   System.out.println(B2);
	   System.out.println(Arrays.toString(B));//�Ѿ�ȡ����ǰ��λ��ACSII��
		/*
		 *�鿴String��Ĺ��췽����
		 *String(byte[] bytes) ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte ���飬����һ���µ� String��
		 *���ã����ֽ�����ת��Ϊ�ַ���
		 * 
		 */
	   
	   String B3=new String(B);
	   System.out.println(B3);
	   
	   
	   B2=dur2.read(B);
	   System.out.println(B2);
	   System.out.println(new String(B));
	  
		System.out.println("-------------------");
		//����Ϊ���ֽڶ�ȡ
		
          int A = 0;
	      while(true) {
		  if((A=dur.read())!=-1) {
			  System.out.println((char)A);    
		  }  
	  }
	     
	      
	}
}
