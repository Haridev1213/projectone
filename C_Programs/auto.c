#include<stdio.h>
//#include"extern.c"
int a;
int main()
{
	extern int a;
	printf("%d",a);
	return 0;
}
