package zuoye;

public class Circle extends Shape {
    double radius;                         //半径成员变量
    final double Pi = 3.14f;              //成员常量 
    Circle(double r) {         //构造方法，实现创建对象时对成员变量半径的初始化
        this.radius = r;
    }
    
    
    
    public double getCir() {   //获得○周长的方法
        return 2 * Pi * radius;
    }
    
    
    
    public double getArea() {   //获得○面积的方法
        return Pi * radius * radius;
    }  
   
  /*  public static void main(String[] args)
    {
    	new Circle(10.3).aa();
    }
    
    
    public void aa()
    {
    	 a();
    }*/
    
}