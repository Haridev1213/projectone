// program name : while loop palindrome
#include<iostream>
using namespace std;
int main()
{
	int a,b,c,d=0;
	cout<<"enter the palindrome number";
	cin>>a;
	c=a;
	while(a>0)
	{
		b=a%10;
		d=(d*10)+b;
		a=a/10;
		
	}
	
	if(c==d)
	{
		cout<<endl<<"the given number is a palindrome number";
	}
	else
	{
		cout<<endl<<"the given number is not a palindrome number";
	}
}
