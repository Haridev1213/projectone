//program name: function using with return type and with arguments
#include<iostream>
using namespace std;
int oddoreven(int a)
{
if(a%2==0)
{
	cout<<"the given number is even";
	
}
else
{cout<<"the given number is odd";
}
}

int main()
{
	int a,b;
	cout<<"enter the value";
	cin>>a;
	b=oddoreven(a);
	
}
