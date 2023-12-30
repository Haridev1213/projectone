//program name : access specifiers private
#include<iostream>
using namespace std;
class Rad
{
private:
	double radius;
public:
	
	void area(double r)
	{
		radius=r;
double area=3.14*radius*radius;
cout<<area;
	}		
};
int main()
{
	Rad a;
	a.area(1);
}
