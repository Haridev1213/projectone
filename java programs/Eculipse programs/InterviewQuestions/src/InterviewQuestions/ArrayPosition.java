package InterviewQuestions;
import java.util.*;

public class ArrayPosition {
	
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int arr[]=new int[10];
	int i;
	System.out.println("enter the array size");
	int size=input.nextInt();
	for(i=0;i<size;i++)
	{
		arr[i]=input.nextInt();
	}
	System.out.println("enter the number to check in the array");
	int check=input.nextInt();
	for(i=0;i<size;i++)
	{
		if(arr[i]==check)
		{
			System.out.println("the number="+arr[i]+"position="+i);
		}
	}
 }
}
