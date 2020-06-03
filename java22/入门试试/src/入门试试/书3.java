package 入门试试;
//接口
import com.bao.bao;
public class 书3 {
	
	/*public String  toString() {
		return "这是方法" + getClass().getName()+ "   222 ";
	}*/

	
public static void main(String args[]) {

	String b1="123";
	String b2="123";
	
	System.out.println(b1.equals(b2));
	
	书3 a=new 书3();
	
	书3 b=new 书3();
	new 书3();
	System.out.println(b1.equals(b2));
	
	
	System.out.println("输出"+Math.cos(0));//数学函数
	System.out.println("随机数"+(int)(Math.random()));//随机数+强类型转换
	
	
	System.out.println("随机数2:  "+sjs(1,6));//随机数+强类型转换
	
	System.out.println("字母随机数"+(char)('a'+Math.random()*26));//随机数+强类型转换

                 
}	


public static  int sjs(int a,int b) {
	
	int shu= a+   (int)( Math.random()*(b-a) );
	int shu2= a+   (int) Math.random()*(b-a) ;
	
	return shu;
}




}
