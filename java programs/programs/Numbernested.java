import java.util.Scanner;
class Numbernested{
	public static void check()
	{
    Scanner input=new Scanner(System.in);
	System.out.println("enter the number");
	int value=input.nextInt();
	if(value==1)
	{
		System.out.println("one");
        check();	
	}
	else if(value==2)
	{
		System.out.println("two");
		check();
	}
	else if(value==3)
	{
		System.out.println("three");
		check();
	}
	else if(value==4)
	{
		System.out.println("four");
		check();
	}
	else if(value==5)
	{
		System.out.println("five");
		check();
	}
	else if(value==6)
	{
		System.out.println("six");
		check();
	}
	else if(value==7)
	{
		System.out.println("seven");
		check();
	}
	else if(value==8)
	{
		System.out.println("eight");
		check();
	}
	else if(value==9)
	{
		System.out.println("nine");
		check();
	}
	else if(value==10)
	{
		System.out.println("ten");
		check();
	}
	else
	{
	System.out.println("wrong Selection");	
	}
	}
   public static void main(String[] args)
   {
	 check();  
   }
}   