//program name : while loop prime number
#include<iostream>
using namespace std;
int main()
{
	int a,b=2;
	cout<<"enter the prime number\n";
	cin>>a;
	while(b<a)
	{
	if(a%b==0)
	{
		cout<<"the given number is not a prime number";
	break;	
		}
		b++;
}
if(a==b)
{
	cout<<"the given number is a prime number";
}
	}
	

