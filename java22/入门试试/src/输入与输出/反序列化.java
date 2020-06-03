package 输入与输出;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class 反序列化 {
	public static void main(String[] args) throws  IOException, ClassNotFoundException {
		
		
		
		ObjectInputStream fx=new ObjectInputStream(new FileInputStream("E:\\File\\序列化.txt"));
				
		Object js=fx.readObject();
		fx.close();
		System.out.println(js);
		
		 序列化的对象 zh=  (序列化的对象)js;
		System.out.println(zh.getName()+"  "+zh.getAge());
		
		
		
	}
	
	

}
