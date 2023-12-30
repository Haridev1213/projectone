package InterviewQuestions;

import java.util.Scanner;

public class ArraySorting {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int arr[]=new int[10];
		int i,j,temp;
		System.out.println("enter the array size");
		int size=input.nextInt();
		for(i=0;i<size;i++)
		{
			arr[i]=input.nextInt();
		}
		
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("After sorting");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}

}
}