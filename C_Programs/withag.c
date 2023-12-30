#include<stdio.h>
int add(int,int);
void main()
{
	int num1,num2,num3;
	printf("enter the value of a and b is\n");
	scanf("%d%d",&num1,&num2);
	num3=add(num1,num2);
	printf("\n\n%d",num3);
		
}
int add(int num1,int num2)
{
	int num4;
	num4=num1+num2;
//	printf("%d",num4);
	return num4;
}
