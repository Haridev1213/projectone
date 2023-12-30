//program name: Nested for to print a star in triangle
#include<iostream>
using namespace std;
int main()
{
	int a,i,j,space;
	cout<<"enter the number of row";
	cin>>a;
	for(i=1;i<=a;i++)
	{
		for(space=i;space<=a;space++)
		{
			cout<<" ";
			
	}
		for(j=1;j<=(i*2)-1;j++)
		{
	cout<<" *";
	}
	cout<<endl;
	}
	
}
