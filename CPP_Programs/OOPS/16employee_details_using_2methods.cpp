//program name : using employee details using methods
#include<iostream>
using namespace std;
class details
{
	public:
		string name;
		int id,i,age,a[30];
	void emp()
	{
	for(i=1;i<=3;i++)
	{
	cout<<"enter the name\n";
	cin>>name[i];
	cout<<"enter the id no\n";
	cin>>id[i];
	cout<<"enter the age\n";
	cin>>age[i];
    }      
    }
};
int main()
{
	details d[5];
	int i;
	d[5].emp();
	for(i=1;i<=3;i++)
	{	
	cout<<d[i].name[i]<<endl<<d[i].id<<endl<<d[i].age<<endl;
    }
}
