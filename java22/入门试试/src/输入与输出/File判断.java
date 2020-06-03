package 输入与输出;

import java.io.File;

/*
 * File判断功能的方法
 * - public boolean exists() :此File表示的文件或目录是否实际存在。
   - public boolean isDirectory() :此File表示的是否为目录。
   - public boolean isFile() :此File表示的是否为文件。
 */



public class File判断 {
	
	public static void main(String[] args) {
	
		File wj=new File("E:\\File\\ces.txt");
		
		System.out.println(wj.exists());//- public boolean exists() :此File表示的文件或目录是否实际存在。
		System.out.println("1---------------------------\n");
		
		File wj2=new File("E:\\File\\wenjian.txt");
		System.out.println(wj2.isDirectory());
		System.out.println(wj2.isFile());
		System.out.println("2---------------------------\n");
		File wj3=new File("E:\\File");
		System.out.println(wj3.isDirectory());
		System.out.println(wj3.isFile());
		
/*
		    ---- public boolean isDirectory() : 此File表示的是否为目录。
                               用于判断构造方法中给定的路径是否以文件夹结尾
                                是:true / 否:false
                                
            ---- public boolean isFile() :此File表示的是否为文件。
                               用于判断构造方法中给定的路径是否以文件结尾
                                是:true / 否:false
                                
                          注意:1.电脑的硬盘中只有文件/文件夹,两个方法是互斥
                   2.这两个方法使用前提,路径必须是存在的，否则都返回false
 */
		
		
		
	}

}
