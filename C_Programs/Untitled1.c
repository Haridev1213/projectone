#include<stdio.h>
void add();
void sub(int,int);
int multi(int,int);
int div();
void main()
{
int num1,num2,num4,num5;

add();

printf("enter the value of num1 and num2 for sub\n");
scanf("%d%d",&num1,&num2);
sub(num1,num2);

printf("enter the value of num1 and num2 for multiple\n");
scanf("%d%d",&num1,&num2);
num4=multi(num1,num2);
printf("multiple %d",num4);

num5=div();
printf("divi %d",num5);
}
void add()
{
	int num1,num2,num3;
	printf("enter the num1 and num2 value");
	scanf("%d%d",&num1,&num2);
	num3=num1+num2;
	printf("%d",num3);
}
void sub(int num1,int num2)	
{
int num3;
num3=num1-num2;
printf("%d",num3);
}
int multi(int num1,int num2)	
{
int num3;
num3=num1*num2;
return num3;
}
int div()
{
int num3,num1,num2;
printf("enter the value of num1 and num2");
scanf("%d%d",&num1,&num2);
num3=num1/num2;
return num3;
}
