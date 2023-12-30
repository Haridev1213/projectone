//program name : using public by using cin to get the values
#include<iostream>
using namespace std;
class student
{
	public:
		
		string name;
		int id;
		float mark;
		
		};
	
int main()
{
	student s;
	cin>>s.name;
	cin>>s.id;
	cin>>s.mark;
	cout<<s.name<<endl<<s.id<<endl<<s.mark;
	
	
}

