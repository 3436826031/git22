package ��������;

public class ����2 {
	
	
	static int gu=666;//��̬���õĶ�
	public static void main(String args[]) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		
		new ����2();
		����2 duix2=new ����2();
		����2 duix3=new ����2();
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
	
	
	
 ����2(){
		  System.out.println("ffa1111");  
	  }
	  
	 public  void ffa() {
		  System.out.println("ffa2222221111");
	  }
	
	
	
}
