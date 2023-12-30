//program name : using employee details using methods
#include<iostream>
using namespace std;
class details
{
	public:
    string name;
	int id,i,age;
};
int main()
{
	details d;
	int i;
		for(i=1;i<=3;i++)
	{
	cout<<"enter the name\n";
	cin>>d.name;
	cout<<"enter the id no\n";
	cin>>d.id;
	cout<<"enter the age\n";
	cin>>d.age;
    cout<<d.name<<endl<<d.id<<endl<<d.age<<endl;
	}
}

