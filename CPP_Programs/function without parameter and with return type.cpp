//program name : program name functions without return type and with parameter
#include<iostream>
using namespace std;
void sum(int a,int b);
int main()
{
	int a,b;
cout<<"enter the two values";
	cin>>a>>b;	
	
	sum(a,b);
}
void sum(int a,int b)
{
cout<<a+b;
}
