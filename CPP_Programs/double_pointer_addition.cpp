//Program name : Double pointer addition
#include<iostream>
using namespace std;
int main()
{
	int a,*b,**c;
	cout<<"enter the value of a";
	cin>>a;
	b=&a;
	c=&b;
	cout<<*b+**c;
}
