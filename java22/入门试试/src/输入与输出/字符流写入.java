package 输入与输出;

import java.io.FileWriter;
import java.io.IOException;
/*
字符输出流写数据的方法
void write（char[] cbuf）写入字符数组
abstract void write （char[] cbuf，int off，int len）写入字符数组的某一部分，off数组的开始索引，len写的字符个数
void write（String str）写入字符串
void write（String str，int off ，int len）写入字符串的某一部分，off字符串开始索引，len写的字符个数
构造方法：FileWrite（File file）根据给定的File对象构造一个FileWrite对象
FileWriter（String FileName）根据给定的文件名构造一个FileWrite对象
参数写入对象数据的目的地
Sting file（File file）根据给定的File对象构造一个FileWrite对象


*/

public class 字符流写入 {
	
	//Writer
	
	public static void main(String[] args) throws IOException {
		FileWriter xr=new FileWriter("E:\\File\\字符写入.txt");
		
		xr.write(97);//还是ASCII表写入
		
		xr.write("你好");
		
		char[] A= {'啊','哈','哈'};
		
		xr.write(A);
		
		xr.flush();//刷新到存档点
		
		xr.close();
		
		
		
	}
	
	

}
