//program name : perimeter of the circle using class and object
#include<iostream>
using namespace std;
class peri
{
	public:
	int a,b;
	void per()
	{
	cout<<"enter the height and length";
	cin>>a>>b;
	cout<<"perimeter is ="<<2*a+2*b;
	
}
};
int main()
{
	peri b;
	b.per();
	}	

