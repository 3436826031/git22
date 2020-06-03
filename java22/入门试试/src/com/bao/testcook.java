package com.bao;

public class testcook {
	
	
	
	public static void main(String args[]) 
	{
		
		
	bj(new cook() {          
		@Override
		public void makefood() {
			// TODO 自动生成的方法存根
			System.out.println("12121212");
		}
	});
		
		
		
	bj(()->{
		System.out.println("4565");
	});
	
	
	}
	
	
	
	
	

	
	public static void bj(cook cook1) {//将接口对象作为参数
		
		cook1.makefood();
		
	}
	

}
