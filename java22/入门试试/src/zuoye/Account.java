package zuoye;

public class Account {
int zhh;
int cunk;


public Account(int zhh,int cunk) {
	this.zhh=zhh;
	this.cunk=cunk;
	
	
}
	
public void cun(double shu) {
this.cunk+=shu;
	
}
public void qu(double shu2) {
	
if(cunk<=shu2)	{
	System.out.println("Óà¶î²»×ã");
	
}
else
this.cunk-=shu2;	
	
	
}

public int show() {
	
	return this.cunk;
	
}

	
}
