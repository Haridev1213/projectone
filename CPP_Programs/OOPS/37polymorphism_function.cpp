//program name : polymorphism is function overriding or method overriding
#include<iostream>
using namespace std;
class base
{
public:
void dis()
{
cout<<"base class";	
	}		
};
class deried:public base
{
public:
void dis()
{
cout<<"derived class";	
}	
};
int main()
{
	derived obj;
	obj.dis();
}
   
