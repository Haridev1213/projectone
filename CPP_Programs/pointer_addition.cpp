//program name : pointer addition
#include<iostream>
using namespace std;
int main()
{

	int *a,*b,c,d;
	cout<<"enter the c and d values\n";
	cin>>c>>d;
	a=&c;
	b=&d;
	cout<<*a<<endl<<*b;
}
