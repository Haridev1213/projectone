//program namme : To initialize a value by users using private
#include<iostream>
using namespace std;
class details
{
    private:	
		int sno;
		string stdname;
		float marks;
	public:
		void students(int s,string n,float m)
		{
			sno=s;
			stdname=n;
			marks=m;
			cout<<sno<<endl<<stdname<<endl<<marks;	
		}	
		
};

int main()
{
details d;
d.students(123,"hari deva",90);
}
