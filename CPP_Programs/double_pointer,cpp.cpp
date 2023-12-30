//program name : Double pointer 
#include<iostream>
using namespace std;
int main()
{
	int a,*b,**c;
	cout<<"enter the a value";
	cin>>a;
	b=&a;
	c=&b;
	cout<<*b<<**c;
}
