package 输入与输出;
/*
 递归就是自己调用自己
  
  main（）{
     a();}
 
 a(){
 a()
 }

 * 
 * */

//计算1--n
/*
   定义一个方法,使用递归计算1-n之间的和
    1+2+3+.. .+n
      可以倒过来想，这样就有结束条件了  n+(n-1)+(n-2)+...+1
      已知:最大值:n  最小值:1

 * */
public class 递归 {
	
	public static void main(String[] args)  {
		
		sum(3);
		System.out.println(sum(3));
		jc(3);
		System.out.println(jc(4));
	}
	



/*
使用递归必须明确:
1. 递归的结束条件
获取到1的时候结束

2.递归的目的
获取下一个被加的数字(n-1)

 * */
	private static int sum(int i) {
		
	if(i==1) {                                            //1. 递归的结束条件
		return 1;	
        }
		
		return i + sum(i-1);

	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
private static int  jc(int i) {
	if(i==1) {
		return 1;
		
	}	
	
	return i*jc(i-1);
	
		
	}
	
	
	
	
	
	
		

}
