//program name : single level inheritance
#include<iostream>
using namespace std;
class Details 
{
	public:
	string name;
	int id;
	float marks;
	public:
	void de()
	{
	cout<<"enter the name\n";
	cin>>name;
    cout<<"enter the id no\n";
	cin>>id;
	cout<<"enter the marks";
	cin>>marks;
}
};
class Details1:public Details
{
	public:
	void num()
	{
	cout<<name<<endl<<id<<endl<<marks<<endl;
    }
};
int main()
{
	Details1 d;
	d.de();
	d.num();
	
}
