package oopsinterviewquestions;

public class BankDetails {
	private String name;
	private String pass;

public BankDetails(String name, String pass) {
	this.name=name;
	this.pass=pass;
 }

public void Balance() {
	if(name.equals("hari")&&pass.equals("12345"))
	{
		System.out.println("balance=1000");
	}
	else
	{
		System.out.println("Check your Details");
	}
  }	
 	
}