//program name : Array given array in ascending order
#include<iostream>
using namespace std;
int main()
{
	int a[10],i,size,as;
	cout<<"enter the size of an array";
	cin>>size;
	cout<<"enter the elements of an array";
	for(i=0;i<size;i++)
	{
	cin>>a[i];
	}
	as=a[0];
	for(i=0;i<size;i++)
	{
	if(a[i]<as)
	{
		as=a[i];
		a[0]=as;
		as=a[0];
	
	}
	
	}
	
}
