//program name:Hierarchical inheritance using RBI
#include<iostream>
using namespace std;
class rbi
{
public:
	float a;
	void rb()
	{
cout<<"enter the rate of interest of RBI";
cin>>a;
}
 };
class sbi:public rbi 
{
public:
	float b;
	void sb()
	{
		cout<<"enter the rate of interest";
		cin>>b;
		cout<<"the sbi rate of interest is ="<<endl<<b;
	}
};
class corporation:public rbi
{
public:
float c;
void cor()
{
	cout<<"enter the rate of interest";
	cin>>c;
	cout<<"the corporation bank rate of interets is=\n"<<c;
	}	
};
class hdfc:public rbi
{
public:
float d;
void hd()
{
	cout<<"enter the rate of interest";
	cin>>d;
	cout<<"the hdfc bank of interest is =\n"<<d;
	}	
}; 
int main()
{
int interest;
	rbi r;
	sbi obj;
	corporation obj1;
	hdfc obj2;
	r.rb();
	cout<<"enter the number to know the rate of interest\n"<<"1 sbi\n"<<"2 corporation\n"<<"3 hdfc\n"<<"4 exit";
	cin>>interest;
	switch(interest)
{
		case 1:
			obj.sb();		
		break;
		case 2:
			obj1.cor();
			break;
		case 3:
			obj2.hd();
			break;
		default:
		cout<<"thank you ";	
}
}   
