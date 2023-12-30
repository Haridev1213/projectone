package oopsinterviewquestions;

public class EmployeeDetails {
	
	private String name,age,gender;
	
	public EmployeeDetails(String name,String age,String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
		}
	
	public String  details() {
		return ("name="+this.name+"\nage="+this.age+"\ngender="+this.gender);
	}

}
