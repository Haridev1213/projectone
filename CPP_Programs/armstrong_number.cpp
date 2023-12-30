//program name : armstrong number
#include<iostream>
using namespace std;
class arm
{
	public:
	int a,b,i,c,plus=0,d;
	void sum()
	{
	cout<<"enter the number";
	cin>>a;
	d=a;
	for(i=1;i<=a;i++)
	{
		b=a%10;
		c=b*b*b;
		plus=plus+c;
		a=a/10;
	}
	cout<<plus;
}
};
class check:public arm
{

public:
	void num()
	{
	if(d==plus)
	{
	cout<<"\nthe given number is a armstrong number";
	}
	else
	{
		cout<<"\nthe given number is not a armstrong number";
	}
}};
int main()
{
	check d;
	d.sum();
	d.num();
}
