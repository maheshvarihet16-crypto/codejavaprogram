import java.util.Scanner;
class Employee{
	String name;
	String department;
	
	void getDetails(String name,String department){
		this.name=name;
		this.department=department;
	}
	void displayDetails(){
		System.out.println("employee name: "+name);
		System.out.println("department name: "+department);
	}
}

class Manager extends Employee{
	String TeamSize;
	String ProjectName;
	
	void getDetails(String name,String department, String Teamsize,String ProjectName){
		this.name=name;
		this.department=department;
		this.TeamSize=TeamSize;
		this.ProjectName=ProjectName;
	}
	void displayDetails(){
		System.out.println("Manager name: "+ name);
		System.out.println("manager_department name: "+department);
		System.out.println("Size: "+ TeamSize);
		System.out.println("ProjectName: "+ ProjectName);
	}
}

public class EmployeeDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		
		Employee e=new Employee();
		System.out.println("Enter employee name:");
		String e_name=sc.nextLine();
		System.out.println("Enter employee department name:");
		String e_dept=sc.nextLine();
		
		e.getDetails(e_name,e_dept);
		
		Employee m= new Manager();
		System.out.println("Enter manager name:");
		String m_name=sc.nextLine();
		
		System.out.println("Enter manager department name:");
		String m_dept=sc.nextLine();
		

		System.out.println("Enter manager team size:");
		String m_size=sc.nextLine();
		
	
	   System.out.println("Enter Project name:");
	   String m_pname=sc.nextLine();
		
		
		((Manager)m).getDetails(m_name,m_dept,m_size,m_pname);
		
		System.out.println("\n Employee details:");
		e.displayDetails();
		
		System.out.println("\n manager details:");
		m.displayDetails();
	}
}