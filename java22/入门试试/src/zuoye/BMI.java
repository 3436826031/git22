package zuoye;

import java.util.Scanner;

public class BMI {


public static void main(String[] args) {

float bmi, weight, height;

Scanner sc = new Scanner(System.in);

System.out.println("���������أ�");

weight = sc.nextFloat();

System.out.println("��������ߣ�");

height = sc.nextFloat();

bmi = weight / (height * height);

if (bmi < 18) {
	System.out.println("ƫ��");

	} else if (bmi <= 25) {

	System.out.println("����");

	} else if (bmi <= 30) {

	System.out.println("����");

	} else if (bmi <= 35) {

	System.out.println("��ȷ���");

	} else if (bmi <= 40) {

	System.out.println("�жȷ���");

	} else {

	System.out.println("�ضȷ���");
	}

	}
}