//program name : Nested while to print a strong number
#include<iostream>
using namespace std;
int main()
{
	int a,b,c,i,d,sum=0;
	cout<<"enter the number";
	cin>>a;
	d=a;
	while(a>0)
	{
	c=1;	
	b=a%10;
	for(i=1;i<=b;i++)
	{
		c=c*i;
}
sum=sum+c;
		a=a/10;
	}
	cout<<"the strong number ="<<sum<<endl;
if(sum==d)
{cout<<"the given number is strong number";
	}	
	else
	{
		cout<<"the given number is not a strong number";
	}
}
