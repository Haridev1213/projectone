//program name : Array minimum number in the given array
#include<iostream>
using namespace std;
int main()
{
	int a[10],size,min,i;
	cout<<"enter the size of an array\n";
	cin>>size;
	cout<<"\nenter the elements of the given array\n";
	for(i=0;i<size;i++)
	{
	cin>>a[i];	
	}
	min=a[0];
	for(i=0;i<size;i++)
	{
	if(a[i]<min)
	{
		min=a[i];
	}
}
cout<<"minimum number is="<<min;
}
