package zuoye;

public class mianji implements Areable{
	
	double r;

	public mianji(double r) {
	
		this.r = r;
	}
	
	
	public void getArea(){
		double mj=PI*r*r;
		System.out.println(mj);
		
	}
	
	public static void main(String args[]) {
		mianji a=new mianji(6);
		
	    a.getArea();
		
		
		
	}
	
	
	

}
