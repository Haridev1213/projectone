#include<stdio.h>
void main()
{
	int a,b,*c,*d,e;
	printf("enter the values of a and b\n");
	scanf("%d%d",&a,&b);
	c=&a;
	d=&b;
	e=*c+*d;	
	printf("%d",e);
}
