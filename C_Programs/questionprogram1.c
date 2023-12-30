#include<stdio.h>
void main()
{
	char variable1=100;
	{
	char variable1=200;
	printf("%d",variable1);
	}
}
printf("%d",variable1);
getch();
}
