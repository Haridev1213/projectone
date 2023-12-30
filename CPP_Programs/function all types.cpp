//program name:fuction all types
#include<iostream>
using namespace std;
void factorial();
void primenumber(int a);
int multiplication();
int fibonacci(int a);
int main()
{
	int a,b,c;
	factorial();
	cout<<"\nenter the prime number";
	cin>>a;
	primenumber(a);
	b=multiplication();
	cout<<"\nenter the fibonacci number";
	cin>>a;
	c=fibonacci(a);
}
void factorial()
{
int i,fact=1,num;
cout<<"enter the facctorial number";
cin>>num;
for(i=1;i<=num;i++)
{
	fact=fact*i;
}
cout<<fact;
}
void primenumber(int a)
{
int b=2;
while(b<a)
{
if(a%b==0)
{
	cout<<"\nthe given number is not prime number";
	break;
}
	b++;
}
if(a==b)
{
cout<<"\nthe given number is prime number";	
	}	
}
int multiplication()
{
int i,mul,num1;
cout<<"\nenter the multiplication number";
cin>>num1;
for(i=1;i<=10;i++)
{
	mul=i*num1;
	cout<<mul<<endl;
}	
}
int fibonacci(int a)
{
	int i=0,j=1,c,d;
	cout<<i<<endl<<j<<endl;
	for(c=2;c<=a;c++)
	{
		d=i+j;
		cout<<d<<endl;
		i=j;
		i=d;
	}
	
}
