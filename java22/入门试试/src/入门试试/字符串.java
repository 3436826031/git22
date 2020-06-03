package 入门试试;

public class 字符串 {
	
	int cd[]=new int[5];
	
	public static void main(String args[]) {
		
		
String a="dsfds";

String b=new String("abcdef");

String c=a+""+b;

System.out.println(c);

int chang=b.length();//获取字符串长度

int sou=b.indexOf("c");//搜索字符,,返回其位置下标

System.out.println(sou);
//cahrAt(下标)
System.out.println(b.charAt(sou));//输出指定下标的字符串 




	}
	
}
