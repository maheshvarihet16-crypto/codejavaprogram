 class Shape{
	double d1;
	double d2;
	
	void getData(double d1,double d2){
		this.d1=d1;
		this.d2=d2;
	}
}
class Triangle extends Shape{
	double Area(){
		return 0.5*d1*d2;
	}
}
class Rectangle extends Shape{
	double Area(){
		return d1*d2;
	}
}
public class ShapeDemo{
public static void main(String[] args){
	Triangle t=new Triangle();
	Rectangle r=new Rectangle();
	
	t.getData(4,5);
	r.getData(4,5);
	System.out.println("Triangle Area="+ r.Area());
	System.out.println("Rectangle Area="+ t.Area());

  }
}