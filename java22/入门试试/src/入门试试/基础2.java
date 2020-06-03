package 入门试试;

public class 基础2 {
	
	
	static int gu=666;//静态公用的对
	public static void main(String args[]) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		
		new 基础2();
		基础2 duix2=new 基础2();
		基础2 duix3=new 基础2();
		System.out.println("  "+(duix2==duix3));
        duix3.ffa();
		duix3.gu=777;
		duix2.gu=555;
		duix3.ff2();
		duix2.gu++;
		System.out.println(duix3.gu);
		
	}
	
	
	void ff2(){
		gu=1;
	}
	
	
	
 基础2(){
		  System.out.println("ffa1111");  
	  }
	  
	 public  void ffa() {
		  System.out.println("ffa2222221111");
	  }
	
	
	
}
