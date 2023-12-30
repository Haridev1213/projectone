//program name : Multiple Inheritance length and bredth
#include<iostream>
using namespace std;
class length
{
public:	
	int l;
	void len()
	{
	cout<<"enter the length\n";
	cin>>l;
}};
class bredth
{
public:	
	int b;
	void bre()
	{
	cout<<"enter the bredth\n";
	cin>>b;
}};
class area:public length,public bredth
{
public:	
	int c;
	void ar()
	{
	len();
	bre();	
	c=l*b;
	cout<<"the area is\n"<<c;
}};
int main()
{
	area obj;
	obj.ar();
}
