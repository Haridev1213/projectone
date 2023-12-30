#include<stdio.h>
#include<string.h>
struct students
{
char name[40];
int id;
int marks;	
}a,b;
void main()
{
	strcpy(a.name,"hari");
	a.id=123;
	a.marks=60;
	printf("%s\n%d\n%d\n",a.name,a.id,a.marks);
	printf("size%d\n",sizeof(a));
	strcpy(b.name,"dev");
	b.id=456;
	b.marks=90;
	printf("%s\n%d\n%d",b.name,b.id,b.marks);
	printf("%d\n",strlen(a.name));
}

