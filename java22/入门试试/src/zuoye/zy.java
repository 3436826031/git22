package zuoye;

import java.util.Scanner;

/*1.衡量一个人胖与不胖通用的计算公式是BMI（体重指数）＝体重（公斤）除以身高（米）的平方。BMI在18—25属正常范围，
 * 大于25为超重，大于30为轻度肥胖，大于35为中度肥胖，大于40为重度肥胖。编写一个程序，实现用户输入体重和身高，显示胖瘦情况。

*/
public class zy {

	int BMI;
	
Scanner sc = new Scanner(System.in);
Scanner sc2 = new Scanner(System.in);
	int tz = sc.nextInt();
	int sg=sc2.nextInt();
	
	
	
	public void BMI(int tz,int sg) {
BMI=	tz/sg*sg;	
	}
	

	

	
	
	if(18<BMI<25) {
		System.out.println("正常范围");
		
	}
	
	else if(25<BMI<30) {
		
		System.out.println("超重");
	}
	
	else if(50<BMI) {
		
		
		
	}
	
	
	
}
