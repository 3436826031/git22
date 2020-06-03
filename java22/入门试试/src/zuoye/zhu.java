package zuoye;

import java.util.Scanner;

public class zhu {
	
	public static void main(String arge[]) {
		int dur;
		Account a=new Account(123,100);
		
		
		
		
		Scanner sc=new Scanner(System.in);
		dur=sc.nextInt();
		a.cun(dur);
		
		System.out.println(a.show());
		
		/*if(dur==1)
			a.cun();
		else if(dur==2)
			a.qu();
		
		else if(dur==3)*/
		System.out.println(a.show());
		
		
		

	}
	

}
