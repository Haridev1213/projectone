//program name: polymorphism function overloading
#include<iostream>
using namespace std;
int var(int);
float var(float);
double var(double);
int main()
{
int a=10;
cout<<var(a)<<endl;
float b=20.22;
cout<<var(b)<<endl;
double c=39;
cout<<var(c)<<endl;
}
int var(int a)
{
cout<<"the int is=\n";
return a;	
} 
float var(float b)
{
	cout<<"the float value is=\n";
	return b;
}
double var(double c)
{
	cout<<"the double value is =\n";
	return c;
}
