package 入门试试;

public class a12 {
	
	public static void main(String[] args) {	
		b c=new b();	
	}

}


class a{
	String i;
	int b;
	a(){	
	System.out.println("调用方法1\n");
	}
	a(int i){
		System.out.println("有参数a");
	}
}


class b extends a {
	
	int bi;
	String c;
	b(){
	System.out.println("231111111111111");
	   }
}


