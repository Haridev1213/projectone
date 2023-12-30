//program name : volume of the circle
#include<iostream>
using namespace std;
class volume
{
	int r,h;
	public:
		void vol()
		{
			cout<<"enter the radius and height of the circle\n";
			cin>>r>>h;
			cout<<"the volume is="<<3.14*r*r*h;
		}
};
int main()
{
volume a;
a.vol();
}

