public class Time{
 int hours;
 int minutes;
 
  void setTime(int h,int m){
	  hours = h;
	  minutes = m;
  }
  void DisplayTime(){
	  System.out.println(hours+"hours");
	  System.out.println(minutes+"minutes");
  }
  void addTime(Time t1,Time t2){
	  minutes=t1.minutes+t2.minutes;
	  hours=t1.hours+t2.hours;
  }
 public static void main(String[] args){
	 Time t1=new Time();
	 Time t2=new Time();
	 Time t3=new Time();
	 
	 t1.setTime(3,15);
	 t2.setTime(4,25);
	 
	 System.out.println("Time t1:");
	 t1.DisplayTime();
	 
	 System.out.println("Time t2:");
	 t2.DisplayTime();
	 
	 t3.addTime(t1,t2);
	 t3.DisplayTime();
	 
	 
  }
}