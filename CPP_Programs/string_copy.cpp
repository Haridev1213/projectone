//program name : string copy
#include<iostream>
#include<string.h>
using namespace std;
int main()
{
	char a[20],b[20];
	cout<<"enter the name";
	gets(a);
	cout<<strcpy(b,a)<<endl;
	puts(b);
}
