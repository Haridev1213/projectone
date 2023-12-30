package oopsinterviewquestions;
import java.util.Scanner;
public class EmployeeRegistration {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	    System.out.println("Enter the user name");
	    String name=input.nextLine();
	    System.out.println("enter the age");
	    String age=input.nextLine();
	    System.out.println("enter the gender");
	    String gender=input.nextLine();
	    EmployeeDetails obj=new EmployeeDetails(name,age,gender);
	    System.out.println(obj.details());
		
	}

}
