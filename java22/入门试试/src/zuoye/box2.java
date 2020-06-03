package zuoye;
public class box2 {
	
	double length;
	double width;
	double height;

	public box2(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}


	public String showing(){
           return "长方体的  长："+length+ "宽"+width+"高："+height;
		}
		
		
	public double getv(){
	return length*width*height;
	
	}
	
	
	public double getArea(){
	return 2*(length*width+length*height+width*height);
		}
		
	}
