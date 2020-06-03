package 输入与输出;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import com.sun.tools.javac.code.Attribute.Array;

public class IO输入 {
	/*
	           类 FilterInputStream
	 -----int read() 读取单个字符            ---------------------
	 -----int read(byte[])将字符多个字符---------------------
	 
	          构造方法
	       FileInputStream(File file) 
           FileInputStream(String name) 

	 */
	
	
	public static void main(String[] args) throws IOException {
		FileInputStream dur = new FileInputStream("E:\\File\\读取.txt");
		//FileOutputStream xie=new FileOutputStream("E:\\File\\读取.txt");
		FileInputStream dur2 = new FileInputStream("E:\\File\\读取2.txt");//文本内容:EFGH
		byte[] B=new byte[3];//多字节读取
		
		int B2=dur2.read(B);//这里只会输出数组的有效个数个数
	   System.out.println(B2);
	   System.out.println(Arrays.toString(B));//已经取出来前三位的ACSII表
		/*
		 *查看String类的构造方法：
		 *String(byte[] bytes) 通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。
		 *作用：吧字节数组转化为字符串
		 * 
		 */
	   
	   String B3=new String(B);
	   System.out.println(B3);
	   
	   
	   B2=dur2.read(B);
	   System.out.println(B2);
	   System.out.println(new String(B));
	  
		System.out.println("-------------------");
		//下面为单字节读取
		
          int A = 0;
	      while(true) {
		  if((A=dur.read())!=-1) {
			  System.out.println((char)A);    
		  }  
	  }
	     
	      
	}
}
