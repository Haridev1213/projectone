//program name : Multilevel inheritance length bredth height
#include<iostream>
using namespace std;
class length
{
public:	
	int length;
};
class bredth:public length
{
public:
int bredth;	
};
class height:public bredth
{
public:
int height;	
};
class area: public height
{
public:	
int ar(int l,int b,int h)
{
length=l;
bredth=b;
height=h;
int d;
d=length*bredth*height;
return d;	
}
};
int main()
{
	int a,length1,bredth1,height1;
	area obj;
	cout<<"enter the length\n";
	cin>>length1;
	cout<<"enter the bredth\n";
	cin>>bredth1;
	cout<<"enter the height\n";
	cin>>height1;
a=obj.ar(length1,bredth1,height1);
	cout<<a;
}
