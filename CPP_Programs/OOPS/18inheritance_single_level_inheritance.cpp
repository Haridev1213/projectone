//program name : inheritance single level inheritance
#include<iostream>
using namespace std;
class id
{
public:
	string name;
	int id;	
};
class id1:public id
{
public:
	float marks;
};
int main()
{
id1 a;
cout<<"enter the name\n";
cin>>a.name;
cout<<"enter id\n";
cin>>a.id;
cout<<"enter marks\n";
cin>>a.marks;
cout<<a.name<<endl<<a.id<<endl<<a.marks<<endl;
}
