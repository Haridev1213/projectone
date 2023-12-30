//program name: single level inheritance
#include<iostream>
using namespace std;
class Inputs
{
public:
	int a=4,b=5;
	
//	cout<<"enter the two values\n";
//	cin>>a>>b;
public:
	int mul()
	{
		int c=a*b;
		return c;
	}
};
class Inputs2:public Inputs
{
public:
	void dis()
	{
int result =mul();
cout<<"multiplication of a and b is"<<result;
 cout<<endl<<a+b;
    }
};
int main()
{
Inputs2 t;
t.dis();
}
