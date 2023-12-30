//program name : encapusulation
#include<iostream>
using namespace std;
class room
{
private:
int length,bredth;
public:
void setsi1(int l)
{
	length = l;
	}	
void setsi(int b)
{
	bredth=b;
	}
int getarea()
{
	return length*bredth;
		}		
};
int main()
{int l,b;
	room obj;
	cout<<"enter the lenth and bredth";
	cin>>l>>b;
	obj.setsi(l);
	obj.setsi1(b);
	cout<<obj.getarea();
}

