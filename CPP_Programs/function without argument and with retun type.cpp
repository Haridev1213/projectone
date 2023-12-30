//program name : function with return type and without using parameter
#include<iostream>
using namespace std;
int oddoreven();
int main()
{
	int a;
	a=oddoreven();
}
int oddoreven()
{
	int b;
	cout<<"enter the values of b";
	cin>>b;
	if(b%2==0)
	{
		cout<<"the given number is even number";
	}
	else
	{
		cout<<"the given number is a odd number";
	}
}
