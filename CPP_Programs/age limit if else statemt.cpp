//program name : control statement using nested if and else statement for age limit
#include<iostream>
using namespace std;
int main()
{
int a,b;
cout<<"enter the age";
cin>>a;
if(a>1&&a<=5)
{
cout<<"the given age person is child";	
}
if(a>5&&a<=10)
{
cout<<"the given age person is boy or girl";	
}
if(a>10&&a<30)
{
	cout<<"the given age is a teenager";
	}	
else
{
	cout<<"the given age is a uncle or anty";
}
}

