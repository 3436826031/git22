package ���������;

import java.io.File;

/*
 * File�жϹ��ܵķ���
 * - public boolean exists() :��File��ʾ���ļ���Ŀ¼�Ƿ�ʵ�ʴ��ڡ�
   - public boolean isDirectory() :��File��ʾ���Ƿ�ΪĿ¼��
   - public boolean isFile() :��File��ʾ���Ƿ�Ϊ�ļ���
 */



public class File�ж� {
	
	public static void main(String[] args) {
	
		File wj=new File("E:\\File\\ces.txt");
		
		System.out.println(wj.exists());//- public boolean exists() :��File��ʾ���ļ���Ŀ¼�Ƿ�ʵ�ʴ��ڡ�
		System.out.println("1---------------------------\n");
		
		File wj2=new File("E:\\File\\wenjian.txt");
		System.out.println(wj2.isDirectory());
		System.out.println(wj2.isFile());
		System.out.println("2---------------------------\n");
		File wj3=new File("E:\\File");
		System.out.println(wj3.isDirectory());
		System.out.println(wj3.isFile());
		
/*
		    ---- public boolean isDirectory() : ��File��ʾ���Ƿ�ΪĿ¼��
                               �����жϹ��췽���и�����·���Ƿ����ļ��н�β
                                ��:true / ��:false
                                
            ---- public boolean isFile() :��File��ʾ���Ƿ�Ϊ�ļ���
                               �����жϹ��췽���и�����·���Ƿ����ļ���β
                                ��:true / ��:false
                                
                          ע��:1.���Ե�Ӳ����ֻ���ļ�/�ļ���,���������ǻ���
                   2.����������ʹ��ǰ��,·�������Ǵ��ڵģ����򶼷���false
 */
		
		
		
	}

}
