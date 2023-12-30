#include<stdio.h>
void main()
{
	int num1,num2;
	int arr[2][2],arr1[2][2],arr2[2][2];
	printf("enter the first matrix values\n");
	for(num1=0;num1<2;num1++)
{
	for(num2=0;num2<2;num2++)
	{
	scanf("%d",&arr[num1][num2]);	
}
	}
printf("enter the second matrix values\n");	
for(num1=0;num1<2;num1++)
{
	for(num2=0;num2<2;num2++)
	{
	scanf("%d",&arr1[num1][num2]);	
	}
}
printf("the sum of the matrix is\n");
for(num1=0;num1<2;num1++)
{
	for(num2=0;num2<2;num2++)
	{
arr2[num1][num2]=arr[num1][num2]+arr1[num1][num2];
printf("%d\n",arr2[num1][num2]);
	}
}}
