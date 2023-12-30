// program name : while loop palindrome with character
#include<iostream>
#include<string.h>
using namespace std;
int main()
{
	int b,c,d=0;
	char a[5];
	cout<<"enter the palindrome sentence"<<endl;
	cin>>a[5];
	c=a[5];
	while(a>0)
	{
		b=a[5]%10;
		d=(d*10)+b;
		a[5]=a[5]/10;
		
	}
	
	if(c==d)
	{
		cout<<endl<<"the given sentence is a palindrome ";
	}
	else
	{
		cout<<endl<<"the given sentence is not a palindrome ";
	}
}
