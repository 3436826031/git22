package 内部类;

public class waib {

	int a=0;
	String b="sdas";
	/*waib()
	{
	new neib().c();
	a();
	}
	*/
	
	public static void main(String args[]) {
		
	waib d=new waib();
	neib neib= d.new neib();
	
	waib.neib dd=new waib().new neib();
		neib.c();
	//	System.out.println(b);
		}
		
	
	class neib{
			
		public  void c() {
			
		System.out.println(b);
			
		}
		
	}
	
}










/*



class Circle {
    private double radius = 0;
 
    
    public Circle(double radius) {
    	
    	
    	
        this.radius = radius;
        getDrawInstance().drawSahpe();   //必须先创建成员内部类的对象，再进行访问
    }
     
    private Draw getDrawInstance() {
        return new Draw();
    }
     
    class Draw {     //内部类
        public void drawSahpe() {
            System.out.println(radius);  //外部类的private成员
        }
    }
}

*/












