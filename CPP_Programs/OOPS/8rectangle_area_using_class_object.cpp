//program name : Area of the given structure like square rectangle and triangle by using object and class
#include<iostream>
using namespace std;
class area
{
	public:
void num()
{
	int l,h;
	cout<<"enter the lengths of rectangle\n";
	cin>>l>>h;
	cout<<"the area is="<<l*h;
}
};
int main()
{
area a;
a.num();	
}
