//program name : Hybrid Inheritance ticket booking
#include<iostream>
using namespace std;
class seats
{
public:	
	int sea;
	void ceats()
	{
	cout<<"enter the number of seats\n";
	cin>>sea;
}
};
class bus:public seats
{
public:
int amount;
void amo()
{
	cout<<"the bus ticket prize for chennai is 500 and train ticket is 300\n";
}
};
class bearth:public seats
{
public:
	
void available()
{	
	cout<<"\nno of seats available is 5\n";
	ceats();
	if(sea>0&&sea<=5)
	{
	cout<<"\nthe entered tickets available for 5 mins\n"; 	
	}
	else
	{
	cout<<"\nthe tickets are not available";
	}
}};
class prize:public bearth
{
public:
	ceats();
void pr()
{
	
int total;	
	cout<<"\nthe number of seats are \n"<<sea;
	total=sea*500;
	cout<<"\ntotal prize of bus tickets are=\n"<<total;
}
};
class train:public prize
{
public:
	ceats();
	
int sum;

void tra()
{
available();
pr();	
sum=sea*300;
cout<<"\ntotal prize for the train ticket is=\n"<<sum;	
}};
int main()
{
	bus obj;
	train obj1;
	obj.amo();
	obj1.tra();
}	

