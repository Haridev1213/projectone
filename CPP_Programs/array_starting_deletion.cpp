//program name : Array deletion in the starting value of the array
#include<iostream>
using namespace std;
int main()
{
	int a[10],i,size,posi;
	cout<<"enter the size of an array\n";
	cin>>size;
	cout<<"enter the elements in the array\n";
	for(i=0;i<size;i++)
	{
	cin>>a[i];	
	}
	cout<<"before deletion\n";
	for(i=0;i<size;i++)
	{
	cout<<endl<<a[i];
	}
	for(i=1;i<=size;i++)
	{
	a[i+1]=a[i];	
	}
	cout<<"\nafter deletion\n";
	for(i=0;i<size;i++)
	{
		cout<<endl<<a[i];
	}
	
}
