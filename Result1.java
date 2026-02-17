import java.util.Scanner;
interface Exam{
	boolean isPassed(int marks);
}
interface Classify{
	String getDivision(double average);
}
public class Result1 implements Exam,Classify{
	public boolean isPassed(int marks){
		return marks>=33;
	}
	 public String getDivision(double average){
		if(average>=85){
			return "Distincation";
		}
			else if(average>=75){
				return "first Division";
			}
				else if(average>=55){
				return "second Division";
			}
			else if(average>=33){
				return "third Division";
			}
			else {
				return "Fail";
			}
	}
	public static void main(String []args){
		Result1 r =new Result1();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your marks:");
		int Marks=sc.nextInt();
		System.out.println("Enter your average:");
		double avg=sc.nextDouble();
		
		if(r.isPassed(Marks)){
			System.out.println("You has passed");
		}
		else{
			System.out.println("You has fail");
		}
		
		System.out.println("average:"+ r.getDivision(avg));
	}
}