//program name : class and object what is priate and public
#include<iostream>
using namespace std;
class student
{
	
		
		string name;
		int id;
		float mark;
	public:
	
		void average(string n,int i,float m)
	{
		name=n;
		id=i;
		mark=m;
		cout<<name<<endl<<id<<endl<<mark;	
}
};
int main()
{
	student s;
	s.average("hari",7678,70);

	
	
	
}

