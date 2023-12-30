#include<stdio.h>
#include<string.h>
union students
{
char name[40];
int id;
int marks;	
}a;
void main()
{
	strcpy(a.name,"hari");
	a.id=123;
	a.marks=60;
	printf("%s\n%d\n%d\n",a.name,a.id,a.marks);
	printf("size%d\n",sizeof(a)); 	
}

