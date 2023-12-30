//program name : for loop fibonacci series
#include<iostream>
using namespace std;
int main()
{
	int a,b=0,c=1,d,e;
	cout<<"enter the fibonacci number";
	cin>>a;
	cout<<b<<endl<<c;
	for(d=2;d<=a;d++)
	{
		e=b+c;
		cout<<endl<<e;
		b=c;
		b=e;
		
	}
	
}
