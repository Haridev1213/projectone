//program name : multilevel inheritance area and perimeter
#include<iostream>
using namespace std;
class area
{
public:
void ar()
{
	
int radius;
cout<<"enter radius"<<endl;
cin>>radius;
cout<<"area ="<<2*3.14*radius<<endl;	
}
};
class peri:public area
{
public:
void pr()	
{
int a;
cin>>a;
cout<<"perimeter ="<<a*a;	
}
};
int main()
{
peri p;
p.ar();
p.pr();	
}

