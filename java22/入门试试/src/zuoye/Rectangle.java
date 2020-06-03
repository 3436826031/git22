package zuoye;

public class Rectangle implements Shape2 {
	int chang;
	int kuan;
	int gao;
	
	
	public Rectangle(int chang, int kuan, int gao) {

		this.chang = chang;
		this.kuan = kuan;
		this.gao = gao;
	}


	public int getArea() {
		return chang*kuan*gao;
	}
	
	
	public int getcir() {
		return chang+kuan+gao;	
	}
	
	
}
