//program name : perimeter of the circle using class and object
#include<iostream>
using namespace std;
class peri
{
	public:
	int a,b,c;
	void per()
	{
	cout<<"enter the 3 sides size of the triangle\n";
	cin>>a>>b>>c;
	cout<<"perimeter is ="<<a+b+c;
	
}
};
int main()
{
	peri b;
	b.per();
	}	

