package zuoye;



public class box {
	double chang;
	double kuan;
	double gao;//��Ա����
	
	public box(double chang,double kuan,double gao) {//���췽��
		/*this.chang=chang;//��Ա����this'
		this.kuan=kuan;*/
		this(chang,kuan);
		
		this.gao=gao;
	}
	public box(double chang) {//���췽��
		this.chang=chang;
	
	}
	public box(double chang,double kuan) {//���췽��
		this.chang=chang;
		this.kuan=kuan;
	}
	
	public double tiji() {//����	
		return chang*kuan*gao;	
	}
	public void output(){
		System.out.println(tiji());
	}
	
	
	public static void main(String args[]) {
		
		box duix=new box(1,2,1);
		
		duix.output();
		
		
		
		/*duix.chang=1;
		duix.kuan=2;
		duix.gao=1;*/

		//System.out.println("���"+duix.tiji());
   duix.output();

   }

}
















 /*class box{//��
	
	double chang;
	double kuan;
	double gao;//��Ա����
	
	
	public double tiji() {//����	
		return chang*kuan*gao;	
	}
	
	
	public static void main(String args[]) {
		
		box duix=new box();
		duix.chang=1;
		duix.kuan=2;
		duix.gao=1;
		System.out.println("���"+duix.tiji());
				
		
		
		
	}
	
	
	
}*/