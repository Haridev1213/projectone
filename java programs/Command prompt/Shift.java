//program name : Shift operator
import java.util.Scanner;
class Shift
{
public static void main(String[] args)
{
Scanner ab=new Scanner(System.in);
System.out.println("enter the number and then the shift number");
int c=ab.nextInt();
int d=ab.nextInt();
int e;
e=c<<d;
System.out.println("after shifting is"+e);
}
}
