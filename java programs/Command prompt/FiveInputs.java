//program name: scanning input from user
import java.util.Scanner;
class FiveInputs
{
public static void main(String[] args)
{
System.out.println("enter the integer number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("the given number is"+a);
System.out.println("enter the float number");
float b=sc.nextFloat();
System.out.println("the given float number is"+b);
//System.out.println("enter the name");
//String  d=sc.nextLine();
//System.out.println("the given name is"+d);
System.out.println("enter the number of bytes");
byte d=sc.nextByte();
System.out.println("the given bytes are"+d);
System.out.println("enter the boolean number");
boolean e=sc.nextBoolean();
if(e==true)
System.out.println("the given number is boolean");
else
System.out.println("the given number is not a boolean");	
}
}
