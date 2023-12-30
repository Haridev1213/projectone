#include<stdio.h>
void main()
{
int a[2][2]={1,2,3,4},row,column;
for(row=0;row<2;row++)
{
	for(column=0;column<2;column++)
	{		
	printf("%d\n",a[row][column]);
	}
}
}
