#include<stdio.h>
void main()
{
	int var[]={10,20,25};
	int i,*ptr;
	ptr=&var;
	for(i=0;i<3;i++)
	{
	
		printf("%d\n",i,*ptr);
	
	}
}
