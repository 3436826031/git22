package �ڲ���;

public class niming {
	
	//����ʵ�ַ�������ʵ����һ�֣���������
	
	public static void main(String args[]) {
		
	jiek a=new jiek() {//�����ڲ���  
		@Override
			public void chat() {	
				System.out.println("�����ڲ���");
				
			}
				
		} ;
		
		
		
		a.chat();
		
		
		
		
		
		new jiek() {

			@Override
			public void chat() {
		
				
				System.out.println("�����ڲ���22");
				
			}
			
			
			
			
		}.chat();
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
