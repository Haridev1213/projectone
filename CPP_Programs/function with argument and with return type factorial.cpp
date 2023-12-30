//program name: function using with return type and with arguments
#include<iostream>
using namespace std;
int factorial(int a);
int main()
{
	int a,c;
	cout<<"enter the factorial number";
	cin>>a;
	c=factorial(a);
	
}
int factorial(int a)
{int i,fact=1;
	for(i=1;i<=a;i++)
	{
		fact=fact*i;
	}
	cout<<fact;
}
