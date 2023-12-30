//program name : string concatenation
#include<iostream>
#include<string.h>
using namespace std;
int main()
{
	char a[20],b[20];
	cout<<"enter the name";
	gets(a);
	cout<<"enter the name";
	gets(b);
	cout<<strcat(a,b)<<endl;
	cout<<strrev(a);
}
