package zuoye;

/*抽象类可以*/

public class testShape {
	
	
	static void showShape(Shape a) {
	System.out.println("圆的周长"+a.getCir());	
		
		
	}

	
	 public static void main(String[] args) {
	        Circle c = new Circle(6);
	        showShape(c);   
	        
	        c.a();
	        
	        
	        
	        
	    //    Retangle r = new Retangle(23, 14);
	     //   showShape(r);
	    }
	
	
	
	
	
}
