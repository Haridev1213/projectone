//program name:Multilevel inheritance
#include<iostream>
using namespace std;
class grandfather
{
public:	
	string name;
	int age;
};
class father:public grandfather
{
public:
string name1;
int age1;	
};
class son:public father
{
public:	
string name2;
int age2;	
};
int main()
{
	son s;
	cout<<"enter the grandfather name\n ";
	cin>>s.name;
	cout<<"enter the age\n";
	cin>>s.age;
	cout<<"enter the father age\n";
	cin>>s.name1;
	cout<<"enter the age \n";
	cin>>s.age1;
	cout<<"enter the son name\n";
	cin>>s.name2;
	cout<<"enter the age\n";
	cin>>s.age2;
	cout<<s.name<<endl<<s.age<<endl<<s.name1<<endl<<s.age1<<endl<<s.name2<<endl<<s.age<<endl;	
}
