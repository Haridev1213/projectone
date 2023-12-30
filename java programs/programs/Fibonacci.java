import java.util.Scanner;
class Fibonacci{
   public static void main(String[] args)
   {
	   Scanner input=new Scanner(System.in);
	   System.out.println("enter the fibonacci number");
	   int value=input.nextInt();
	   int number=0;
	   int number1=1;
	   int number3,number4;
	   System.out.println(number+"\n"+number1);
	   for(number3=2;number3<value;number3++)
	   {
		   number4=number+number1;
		   System.out.println(number4);
		   number=number1;
		   number1=number4;
	   }   
   }	
}	