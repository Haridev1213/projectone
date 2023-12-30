//program name : perform addition in object and class
#include<iostream>
using namespace std;
class add
{
	public:
		int a,b;
	void addition()	
	{
		cout<<"addition="<<a+b<<endl;
	}
	void sub()
	{
	cout<<"subtraction="<<a-b<<endl;
}
    void mul()
	{
		cout<<"multiplication ="<<a*b<<endl;
}
    void divi()
	{
		cout<<"division="<<a/b<<endl;
	 } 
}; 
int main()
{
add i;
cout<<"enter the a and b value\n";
cin>>i.a>>i.b;
 i.addition();
 i.sub();
 i.mul();
 i.divi();
}
