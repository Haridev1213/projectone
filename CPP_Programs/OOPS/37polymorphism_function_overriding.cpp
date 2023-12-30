//program name : polymorphism is function overriding or method overriding
#include<iostream>
using namespace std;
class base
{
public:
void dis()
{
cout<<"base class\n";	
	}		
};
class derived:public base
{
public:
void dis()
{
cout<<"derived class\n";	
}	
};
int main()
{
	base obj; 
	derived obj1;
    obj.dis();
	obj1.dis();
		
}
   
