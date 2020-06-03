package zuoye;

public class Director extends Employee {

	String transport;


	public Director(String name, int salary, String address, String transport) {
		super(name, salary, address);
		this.transport = transport;
	}


	
	public void show() {
		
		
		super.show();
		System.out.print("daibugongju"+transport);
	}

	
	
	
	
	
}
