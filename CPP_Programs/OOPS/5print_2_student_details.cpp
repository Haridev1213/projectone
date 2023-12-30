//program name: enter 2 student details using class and object
#include<iostream>
using namespace std;
class details
{

	public:
		
		string stdname;
		int id;
		float marks;

};
int main()
{
	int i;
	for(i=0;i<2;i++)
	{
	
	details d;
	cout<<"enter student name\n";
	cin>>d.stdname;
	cout<<"enter id\n";
	cin>>d.id;
	cout<<"enter marks\n";
	cin>>d.marks;
	cout<<"student name="<<d.stdname<<endl<<"idno="<<d.id<<endl<<"mark="<<d.marks<<endl;
}
}

