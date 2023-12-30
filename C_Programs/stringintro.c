#include<stdio.h>
#include<string.h>
void main()
{
	int num3=0;
	char num[10]={'h','e','l','l','o'};
	char num1[1000];
	gets(num1);
	puts(num1);
	for(num3=0;num1[num3]!='\0';num3++)
	{
		printf("%d",num3);
	}
}
