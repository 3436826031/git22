package ����;

public class baozi {
	
	//��������ǰ��ӣ�����������ͨѶ�ķ���
	//�����������
	boolean flay=false;
	
	public static void main(String args[]) {

		baozi bz=new baozi();//ͨ�����������ķ�������ȥ�������߳�
		
		new guke(bz).start();
		
		new baozipu(bz).start();
		
		
		
	}
	
	

	
	

}
