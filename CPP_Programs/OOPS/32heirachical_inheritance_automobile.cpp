//program name : Heirachical inheritance automobiles
#include<iostream>
#include<string.h>
using namespace std;
class automobiles
{
public:
void aom()
{
string name;
cout<<"enter the name";
cin>>name;	
}	
}; 
class bike:public automobiles
{
public:
void two()	
{
int b;
cout<<"enter the number to choose two wheelers\n"<<"1 bajaj\n"<<"2 tvs \n"<<"3 honda\n"<<"4 yamaha\n"<<"5 exit";
cin>>b;
switch(b)
{
case 1:
cout<<"bajaj bikes ";
break;
case 2:
cout<<"tvs bikes ";
break;
case 3:
cout<<"honda bikes";
break;
case 4:
cout<<"yamaha bikes";
break;
default:
cout<<"thank you";	
}
}
};
class cars:public automobiles
{
public:	
int c;
void ca()
{
cout<<"enter the 4 wheeler companies\n"<<"1 tata\n"<<"2 suzuki\n"<<"3 mahendra\n"<<"4 kia\n"<<"5 exit";
cin>>c;
switch(c)
{
case 1:
cout<<"tata";
break;
case 2:
cout<<"suzuki";
break;
case 3:
cout<<"mahendra";
break;
case 4:
cout<<"kia";
break;
default:
cout<<"thank you";	
	}	
}
}; 
int main()
{
	int option;
	automobiles obj;
	bike obj1;
	cars obj2;
	obj.aom();
	cout<<"enter the number to choose the automobiles\n";
	cin>>option;
	if(option==1)
	{
		obj1.two();
	}
	if(option==2)
	{
		obj2.ca();
	}
}
