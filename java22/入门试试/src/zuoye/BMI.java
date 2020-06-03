package zuoye;

import java.util.Scanner;

public class BMI {


public static void main(String[] args) {

float bmi, weight, height;

Scanner sc = new Scanner(System.in);

System.out.println("请输入体重：");

weight = sc.nextFloat();

System.out.println("请输入身高：");

height = sc.nextFloat();

bmi = weight / (height * height);

if (bmi < 18) {
	System.out.println("偏轻");

	} else if (bmi <= 25) {

	System.out.println("正常");

	} else if (bmi <= 30) {

	System.out.println("超重");

	} else if (bmi <= 35) {

	System.out.println("轻度肥胖");

	} else if (bmi <= 40) {

	System.out.println("中度肥胖");

	} else {

	System.out.println("重度肥胖");
	}

	}
}