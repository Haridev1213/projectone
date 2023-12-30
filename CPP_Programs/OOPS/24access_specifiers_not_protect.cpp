//program name: access specifier protect
#include<iostream>
using namespace std;
class inputs
{
protected:	
	int a,b;
};
class area:public inputs
{
public:	
	void ar()
	{
cout<<"enter the a value\n";		
	cin>>a;	
	b=a*a;
	
	}
};
class output:public area
{
	cout<<"the area is = "<<b;
};
int main()
{
	output c;
	c.ar();
}
