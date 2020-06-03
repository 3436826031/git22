package zuoye;

public class testbox{

	
	public static void main(String[] args){
		box2 box1=new box2(200,200,200);

		System.out.println(box1.showing());
		System.out.println("箱子的体积为："+box1.getv()+"表面积为："+box1.getArea());
	
		}
}
