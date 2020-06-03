package 入门试试;

//对象，方法；
public class duix {

String a;
int b;
static int c=0;//静态变量，全局条用改变

int id=0;

duix(int x){
	
id=x;	

}




	public static void main(String arg[]){
		
	System.out.println("开始");
		duix dx;  //构建对象
		dx=new duix(1);//实例化
		dx.a="aaa";
		dx.b=1;
		System.out.println(dx.a+dx.b);
		//----------------------------------
		
		duix dx2=new duix(2);//一步
		dx2.c++;//静态公用变量
		dx.c++;
		System.out.println(dx2.c+"  "+dx.c);
		
		duix xs1=new duix(2);
		duix xs2=new duix(3);
      duix xs3=new duix(4);		
		
	   System.out.println(xs1.id);
	   System.out.println(xs2.id);
     System.out.println(xs3.id);
	  lei.ff("asdsa");//调用其他类中的函数
		
	}
		
	
}








class lei{
	
	static void ff(String a){
		System.out.println(a);
		
		
		
	}
	
	
}







