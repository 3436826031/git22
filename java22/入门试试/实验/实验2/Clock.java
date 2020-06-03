package zuoye;

public class Clock {
	int shi;
	int fen;
	int miao;
	
	public Clock(int shi,int fen,int miao) {
		this.shi=shi;
		this.fen=fen;
		this.miao=miao;
	}
	
	
	
	public void show() {
		
		System.out.println("shi:"+shi+"fen"+fen+"miao"+miao);
	}

}
