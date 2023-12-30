#include<stdio.h>
#include<string.h>
void main()
{
	int i,c=0;
	char num[10];
	char num1[10];
	gets(num);
	gets(num1);	
for(i=0;num[10]!='\0'&&num1[10]!='\0';i++)
{
if(num[i]!=num1[i])
{
		c++;
}}
if(c==0)
{
	printf("the given string are same");
}
else
{
	printf("the given string are not same");
	}	
}

				
	



