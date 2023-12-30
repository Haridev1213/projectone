#include<stdio.h>
#include<string.h>
struct studets
{
	char name[40];
	long int firstfivenumber;
	long int lastfivenumber;
}a;
void main()
{
	strcpy(a.name,"hari deva prabhu");
	a.firstfivenumber=98966;
	a.lastfivenumber=12345;
	printf("%s\n%ld%ld\n",a.name,a.firstfivenumber,a.lastfivenumber);
}


