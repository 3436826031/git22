package 输入与输出;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class 序列化 {
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		
		ObjectOutputStream xl=new ObjectOutputStream(new FileOutputStream("E:\\File\\序列化.txt"));
		
		xl.writeObject(new 序列化的对象("张三",14));
		xl.close();
		
		System.out.println(new 序列化的对象("张三",14));
		
	}
	
	
	

}
