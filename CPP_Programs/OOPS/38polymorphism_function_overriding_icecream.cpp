//program name : polymorphism function overriding 
#include<iostream>
using namespace std;
class food
{
public:
void dis()
{	
cout<<"  ice cream\n";	
}};
class shop:public food
{
public:
	void dis()
	{
cout<<"ice cream with coke\n";	
 } 
};
class shop1:public food
{
public:
void dis()
{
	cout<<"ice cream with chocolate\n";
	}	
};
int main()
{
food obj;
shop obj1;	
shop1 obj2;
obj.dis();
obj1.dis();
obj2.dis();	
}
