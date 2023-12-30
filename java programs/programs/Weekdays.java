
import java.util.Scanner;

public class Weekdays{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter the weekdays and vacation");
Boolean weekdays=input.nextBoolean();
Boolean vacation=input.nextBoolean();
check(weekdays,vacation);
}
public static void check(Boolean weekdays,Boolean vacation)
{
if((weekdays==true&& vacation==true)||(weekdays==false&&vacation==false)||(weekdays==false&&vacation==true))
{
	
	System.out.println("true");
	
	
}	 
else
{
	System.out.println("false");
}	
}	
	
	
	
}