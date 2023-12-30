//switch statement
#include<iostream>
using namespace std;
int main()
{
	int a,b,c;
	char d;
	cout<<"enter the values of a and b\n";
	cin>>a>>b;
	cout<<"enter the case value";
	cin>>d;
	switch(d)
	{
		case '+':
			cout<<"the sum is\n";
			cout<<a+b;
			
	
		case '-':
		cout<<"the subtraction is\n";
		cout<<a-b;
		
		case '*':
		cout<<"the multiplication is\n"<<a*b;
		
		case '/':
		cout<<"the disision is\n"<<a/b;	
	}
	
}
