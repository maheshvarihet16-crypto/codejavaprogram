public class University{
	static int totalStudents;
	static String universityName;
	
	static{
		totalStudents=0;
		universityName="xyz";
		System.out.println("static block is created");
	}
	instance{
		System.out.println("instance block is created");
	}
	static int getTotalStudents(){
	  return totalStudents; 
	}
	University(){
		totalStudents++ ;
		System.out.println("constructed is created");
	}
 public static void main(String[] args){
	System.out.println("university name:"+universityName);
	
	University s1=new University();
	
	System.out.println("total student:"+s1.getTotalStudents());
	
	
  }
}