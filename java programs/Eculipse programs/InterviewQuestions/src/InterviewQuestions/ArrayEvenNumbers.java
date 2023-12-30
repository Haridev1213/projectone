package InterviewQuestions;

public class ArrayEvenNumbers {

public static void main(String[] args)
{
	int arr[]= {15,3,5,8,7,6,4};
	int posi,newposi,temp = 0;
	int even[]=new int[7];
	for(posi=0;posi<7;posi++)
	{
		if(arr[posi]%2==0)
		{
		     even[temp]=arr[posi];
		     System.out.println(even[temp]);
		
		}
	}
}

}
