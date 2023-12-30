import java.util.Scanner;
class numberswitch{
	public static void check(){
    Scanner input=new Scanner(System.in);
	System.out.println("enter the number");
	int value=input.nextInt();
	switch(value)
	   {
		case 1:
		System.out.println("one");
		check();
		break;
		case 2:
		System.out.println("two");
		check();
		break;
		case 3:
		System.out.println("three");
		check();
		break;
		case 4:
		System.out.println("four");
		check();
		break;
		case 5:
		System.out.println("five");
		check();
		break;
		case 6:
		System.out.println("six");
		check();
		break;
		case 7:
		System.out.println("seven");
		check();
		break;
		case 8:
		System.out.println("eight");
		check();
		break;
		case 9:
		System.out.println("nine");
		check();
		break;
		case 10:
		System.out.println("ten");
		check();
		break;
		default:
		System.out.println("wrong selection");
	
	   }
	}
public static void main(String[] args)
{
check();	
}	
}	