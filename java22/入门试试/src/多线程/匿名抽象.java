package ���߳�;

public class �������� {
	
	
	/*�������̵߳ı��ʣ�A(ʵ����)�̳г�����runnable����дrun��������������A�Ķ��󣬣�����ͨ��������ֱ�Ӵ���һ�������ڴ���Thread�Ķ���
	 * ʹ��Thread���̳�runnable�Ķ��󣩷�������Thread��A�������ö���ʵ��run����*/
	public static void main(String args[]) {
	Runnable A=new Runnable(){         //��Ҫ����������Ա���Ҫ������
		public void run(){
			
			System.out.println("�����ڲ���----����");
				
		}
		
	};
	
	
	
	new Thread(A).start();
	
	
	
		
	}
	

}
