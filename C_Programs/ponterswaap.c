#include<stdio.h>
void main()
{
	int a,b,c,*d,*e;
	printf("enter the value of a and b\n");
	scanf("%d%d",&a,&b);
	d=&a;
	e=&b;
	c=d;
	d=e;
	e=c;
	printf("%d\n%d\n",*d,*e);
	
}
