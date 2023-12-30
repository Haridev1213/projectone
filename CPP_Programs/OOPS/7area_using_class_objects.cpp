//program name : Area of the given structure by using object and class
#include<iostream>
using namespace std;
class area
{
	public:
		int a,b;
		void structure()
		{
		cout<<3.14*b*b;
	}
};
int main()
{
	area r;
//	cout<<"enter the formula";
//	cin>>r.a;
	cout<<"enter the value";
	cin>>r.b;
	r.structure();
	
}
