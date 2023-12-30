//program name: using without private but the valuse are in the private
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
	cout<<name<<id<<mark;	
	}
};
int main()
{
	student s;
	s.average("hari",123,50);
}

