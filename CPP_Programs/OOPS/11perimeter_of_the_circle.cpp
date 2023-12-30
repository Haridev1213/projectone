//program name : perimeter of the circle using class and object
#include<iostream>
using namespace std;
class peri
{
	public:
	int a;
	void per()
	{
	cout<<"enter the radius";
	cin>>a;
	cout<<"perimeter is ="<<2*3.14*a;
	
}
};
int main()
{
	peri b;
	b.per();
	}	

