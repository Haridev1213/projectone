//program name : polymorphism finction ovrerloading addition
#include<iostream>
using namespace std;
class phone
{
//public:
//int a,n;
public:
void contact(string a,int n)//same method name
{
	cout<<"name is ="<<a<<endl<<"the number is= "<<n<<endl;
} 	
//public:	
//int c;
public:
void contact(string a,int n,int c)//same method name
{
	cout<<"name is="<<a<<endl<<"the number1 is="<<n<<endl<<"the number 2 is"<<c<<endl;
}	
};
int main()
{
	phone obj;
	obj.contact("hari",1234);
	obj.contact("dev",3123,23456);
	
}
