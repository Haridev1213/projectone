package oopsinterviewquestions;
import java.util.Scanner;
public class AccountLogin {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the user name");
		String name=input.nextLine();
		System.out.println("enter the password");
		String pass=input.nextLine();
		BankDetails obj=new BankDetails(name,pass);
		obj.Balance();
	
		
	}

}
