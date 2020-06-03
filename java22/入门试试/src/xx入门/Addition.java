package xx»Î√≈;



public interface Areable{
	double PI=3.14;
	double getArea();
 double getCir(); 
	

}





public class circle implements Areable1 {
	
	double r;
	
	public circle(double r) {
	  this.r = r;
	}


	@Override
	public double getArea() {
		return PI*r*r;
	}
	
	public double getCir() {
		return PI*r*2;
	}
	

	public static void main(String args[]){
		 circle c=new circle(5.0);
		 System.out.println(c.getArea());
		 System.out.println(c.getCir());
	}

}












