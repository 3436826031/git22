package ���������;

import java.io.FileWriter;
import java.io.IOException;
/*
�ַ������д���ݵķ���
void write��char[] cbuf��д���ַ�����
abstract void write ��char[] cbuf��int off��int len��д���ַ������ĳһ���֣�off����Ŀ�ʼ������lenд���ַ�����
void write��String str��д���ַ���
void write��String str��int off ��int len��д���ַ�����ĳһ���֣�off�ַ�����ʼ������lenд���ַ�����
���췽����FileWrite��File file�����ݸ�����File������һ��FileWrite����
FileWriter��String FileName�����ݸ������ļ�������һ��FileWrite����
����д��������ݵ�Ŀ�ĵ�
Sting file��File file�����ݸ�����File������һ��FileWrite����


*/

public class �ַ���д�� {
	
	//Writer
	
	public static void main(String[] args) throws IOException {
		FileWriter xr=new FileWriter("E:\\File\\�ַ�д��.txt");
		
		xr.write(97);//����ASCII��д��
		
		xr.write("���");
		
		char[] A= {'��','��','��'};
		
		xr.write(A);
		
		xr.flush();//ˢ�µ��浵��
		
		xr.close();
		
		
		
	}
	
	

}
