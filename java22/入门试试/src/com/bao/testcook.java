package com.bao;

public class testcook {
	
	
	
	public static void main(String args[]) 
	{
		
		
	bj(new cook() {          
		@Override
		public void makefood() {
			// TODO �Զ����ɵķ������
			System.out.println("12121212");
		}
	});
		
		
		
	bj(()->{
		System.out.println("4565");
	});
	
	
	}
	
	
	
	
	

	
	public static void bj(cook cook1) {//���ӿڶ�����Ϊ����
		
		cook1.makefood();
		
	}
	

}
