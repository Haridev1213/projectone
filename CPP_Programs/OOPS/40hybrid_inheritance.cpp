//program name : hybrid inheritance zoo
#include<iostream>
using namespace std;
class lion
{
public:	
void li()
{
	cout<<"the number of lions are 25\n";
}
};
class tiger
{
public:
void ti()
{
cout<<"the number of tigers are 30\n";
}	
};
class elephants
{
public:	
	void ele()
	{
		cout<<"the number of elephants are 50\n";
	}
};
class zoo:public lion,public tiger,public elephant
{
public:	
	void zee()
	{
	cout<<"total number of animals are\n";	
	}
};
int main()
{
zoo obj;
lion obj1;
tiger obj2;
elephants obj3;
obj.zee();
obj1.li();
obj2.ti();
obj3.ele();
}
