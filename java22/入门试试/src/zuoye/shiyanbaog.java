package zuoye;

public class shiyanbaog{
	public static void main(String args[]) {
		int i = 2;
		switch (i) {
		case 1:
		case 2:  System.out.println("The case is 4");
		case 3:
		case 4:	System.out.println("The case is 4");
		case 5:	System.out.println("The case is 5");  break;
		default:	System.out.println("The case is Default!"); break;
		}
	}
}






/*
public class shiyanbaog{
	
	
	
	
	
		public static void main(String args[]) {
			byte a = 64;
			byte b;
			int i;
			i = a << 2;//256
			b = (byte) (a << 2);
			System.out.println("The Original value of a is:" + a);
			System.out.println("The value of i is:" + i);
			System.out.println("The value of b is:" + b);
		}
	}

	
	
	
	
	
	
	
	
	
	/*
	
	
			 public static void main(String args[]){
					int a=25;
	                 int b=3;
					boolean d=a<b;
					System.out.println(a+"��"+b+"="+d);
					int e=3;
					d=(e!=0&&a/e>5);
					System.out.println(e+"!=0&&"+a+"/"+e+">5="+d);
					int f=0;
					
					d=(f!=0 & a/f>5);
					System.out.println(f+"!=0&"+a+"/"+f+">5="+d);

					//d=(f!=0&&a/f>5);
					//System.out.println(f+"!=0&&"+a+"/"+f+">5="+d);
			}
	  
	
	
	
	
	
	
	
	
	
	
	
}
/*
public static void main(String args[]) {
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 3615l;
        char c = 'a';
        float f = 0.23;
                           
        //double d = 0.7E-3;
        double d = 0.7E-3;
        boolean bl = true;
        String str = "�����ַ�������������" ;
        System.out.println("�ֽ��ͱ��� b = " + b);
        System.out.println("�����ͱ��� s = " + s);
        System.out.println(" ���ͱ��� i = " + i);
        System.out.println("�����ͱ��� l = " + l);
        System.out.println("�ַ��ͱ��� c = " + c);
        System.out.println("�����ͱ��� f = " + f);
        System.out.println("˫���ȱ��� d = " + d);
        System.out.println("�����ͱ��� b = " + bl);
        System.out.println("�ַ�������� s = " + str);
        System.out.println("��fǿ��ת��Ϊ����:" + (int) f);
}


}

/*
public class shiyanbaog{
int x;
public static void main(String args[]){
	 shiyanbaog obj=new shiyanbaog();
    obj.x=5;

change(obj);



System.out.println(obj.x);
}


public static void change(shiyanbaog obj){
obj.x=3;

}
}


*/



/*
public class shiyanbaog{
public static void main(String []args){
int x=5;
change(x);
System.out.println(x);
}
public static void change(int x){
x=3;
}
}

*/




















/*public class shiyanbaog {
    int m = 5;    static int n = 3;
    public static void main(String[] args) {
        shiyanbaog obj1 = new shiyanbaog();     
        shiyanbaog obj2 = new shiyanbaog();
         obj1.m *= 2;
obj1.n *= 4;  
obj2.m += 1; 
obj2.n += 6;
         System.out.println("obj1.m=" + obj1.m);
         System.out.println("obj1.n=" + obj1.n);
         System.out.println("obj2.m=" + obj2.m);
         System.out.println("obj2.n=" + obj2.n);
}
}


public class addTest {
int a;
int b;
public addTest(int a,int b) {
this.a=a; 
this.b=b;

public int add() { 
return (a+b);
}
public int add(int x, int y) { 
	return (x+y);
	}
}
public float add(float x, float y) {
	return (x+ y);
}

public static void main(String args[]) {
	

addTest at=new addTest(1,2);
System.out.println("Ĭ�ϵ�����֮��Ϊ��"+at.add());
System.out.println("��������֮��Ϊ��"+at.add(3,4));
System.out.println("����������֮��Ϊ��"+at.add(3.4f,8.9f));


  }
}

*/

