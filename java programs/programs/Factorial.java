import java.util.Scanner;
class Factorial{
   public static void main(String[] args)
   {
	   Scanner input=new Scanner(System.in);
	   System.out.println("enter the factorial number");
	   int  number=input.nextInt();
	  int result= check(number);
	  System.out.println(result);
   }   
	public static int check(int number)
	{  // System.out.println(number);
		if(number==0)
		{
			return 1;
			
		}
        else
        {
			int result=number*check(number-1);
			//System.out.println(result);
			return result;
		}	
	}	
}   