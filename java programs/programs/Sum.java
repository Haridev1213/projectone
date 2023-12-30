import java.util.Scanner;
class Sum{
  public static void main(String[] args)
  {
	  Scanner ab=new Scanner(System.in);
	  System.out.println("Enter the two numbers");
	  int number1=ab.nextInt();
	  int number2=ab.nextInt();
	  addition(number1,number2);
  }
  public static void addition(int number1,int number2)
  {
	  int number3;
	  if(number1==number2)
	  {
		  number3=(number1+number2)*2;
		  System.out.println(number3);
	  }
	  else
	  {
		  number3= number1+number2;
		  System.out.println(number3);
		     
	  }
	  
  }	  
	  
  
}