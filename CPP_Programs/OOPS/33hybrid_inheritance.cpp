//program name : Hybrid inheritance
#include<iostream>
using namespace std;
class input
{
public:
	int a;
	void in()
	{	
	cout<<"enter the value of a\n";
	cin>>a;
} };
class area:public input
{
public:
void ar()
{
	in();
	int b;
	b=a*a;
	cout<<"area=\n"<<b<<endl;	
	}	
};
class peri
{
public:
int l,b,out;
void per()
{
cout<<"enter the length and bredth\n";
cin>>l>>b;
out=l*b;
cout<<out<<endl;	
}
};
class output:public area,public peri
{
public:	
	int d;
	void close()
	{
	per();
	ar();
	d=out+b;
	cout<<d;
}
};
int main()
{
	output obj;
//	obj.ar();
	obj.close();	
}
