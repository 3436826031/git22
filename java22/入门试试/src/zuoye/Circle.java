package zuoye;

public class Circle extends Shape {
    double radius;                         //�뾶��Ա����
    final double Pi = 3.14f;              //��Ա���� 
    Circle(double r) {         //���췽����ʵ�ִ�������ʱ�Գ�Ա�����뾶�ĳ�ʼ��
        this.radius = r;
    }
    
    
    
    public double getCir() {   //��á��ܳ��ķ���
        return 2 * Pi * radius;
    }
    
    
    
    public double getArea() {   //��á�����ķ���
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