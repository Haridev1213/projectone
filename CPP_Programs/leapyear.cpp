// Name: Hari  Date :9.11.2021   Program name : leap year or not
#include<iostream>
using namespace std;
int main()
{
	int a;
	cout<<"enter the year\n";
	cin>>a;
	(a%4==0)?cout<<a<<"\tthe given year is leap year":cout<<a<<"\tthe given year is not a leap year";
}
