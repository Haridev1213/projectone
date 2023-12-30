#include<stdio.h>
void main()
{
	int var[]={10,20,25};
	int i,*ptr;
	ptr=&var[2];
	for(i=2;i>=0;i--)
	{
	
		printf("%d\n",ptr);
	
	}
}
