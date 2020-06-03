package zuoye;

public class TestInteger {
int m;
int n;
public TestInteger(int m, int n) {
	super();
	this.m = m;
	this.n = n;
}

public void fun1() {
	for(int i=1;i<1000;i++) {
	   if(i%m==0&&i%n==0)
		System.out.println(i);
	}
}
}
