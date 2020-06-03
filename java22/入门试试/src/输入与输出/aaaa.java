package 输入与输出;

import java.io.FileInputStream;
import java.io.IOException;

public class aaaa {
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\网页作业--魏立\\img\\读取.txt");
	

		System.out.println(fis.read());}
	
	
	
	//递归遍历,,,,,,,,,,,,,,
	
	创建一个方法,参数就是文件对象,遍历这个文件,,如果是文件夹就继续重复 
}
