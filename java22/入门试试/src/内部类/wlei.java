package ÄÚ²¿Àà;

public class wlei {

	
	public wlei() {
		
		new nlei().a();
		
		set().a();
	}
	
	
	public nlei set(){
		return new nlei();
	}
	
	int num=10;
	
	class nlei{
		int num=20;
		public void a() {
			int num=30;
			System.out.println("5454");
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(wlei.this.num);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
