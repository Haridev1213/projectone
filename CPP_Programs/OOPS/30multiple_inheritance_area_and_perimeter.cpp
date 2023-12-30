//program name : multiple inheritance area and perimeter child to 2 parrent
#include<iostream>
using namespace std;
class area
{
protected:
	void ar(float l,float b)
{
	cout<<l*b<<endl;
}
};
class perimeter
{
protected:
	void per(float l,float b)
{	
cout<<2*(l+b)<<endl;
}
};
class output:private area,private perimeter
{
public:
	float l,b;
	void data()
{
cout<<"enter the length and bredth \n";
cin>>l>>b;
ar(l,b);
per(l,b);
}
}; 
int main()
{
	output obj;
	obj.data();
}
