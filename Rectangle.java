public class Rectangle{
	  double width;
	  double height;
	
      Rectangle(){
		width=1;
        height=1;		
	  }
	  Rectangle(double w,double h){
		  width=w;
		  height=h;
		  }
	   double getArea(){
		   return width*height;
}
       double getParameters(){
		   return 2*(width+height);
	   }

public static void main(String[] args){
	 Rectangle r1=new Rectangle();
	 System.out.println("area:"+ r1.getArea());
	 System.out.println("parameters:"+ r1.getParameters());
	 
	 Rectangle r2=new Rectangle(3,4);
	 System.out.println("area:"+ r2.getArea());
	 System.out.println("parameters:"+ r2.getParameters());
 }
}