package xx����;

public class ����2 {
	double chang;
	double kuan;
	double gao;//��Ա����
	
	public ����2(double chang,double b,double c) {//���췽��
		this.chang=chang;//��Ա����this'
		kuan=b;
		gao=c;
	}
	
	
	public double tiji() {//����	
		return chang*kuan*gao;	
	}
	public void output(){
		System.out.println(tiji());
	}
	
	
	public static void main(String args[]) {
		
		����2 duix=new ����2(1,2,1);
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