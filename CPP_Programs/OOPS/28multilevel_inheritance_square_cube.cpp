//program name : multilevel inheritance square cube
#include<iostream>
using namespace std;
class input
{
public:
int a;	
void in()
{	
cout<<"enter the a value\n";
cin>>a;	
}};
class square:public input
{
public:
int b;	
void sq()
{	
    in();	
	b=a*a;
	cout<<"square is = \n"<<b<<endl;
}};
class cube:public square
{	
public:
	int c;
void cu()
{
	sq();
c=b*a;
cout<<"cube is=\n"<<c<<endl;	
}	
};
int main()
{
cube obj; 
obj.cu();
}
