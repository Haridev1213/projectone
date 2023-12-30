//program name : Array Deleting a value in the given array
#include<iostream>
using namespace std;
int main()
{
	int a[10],i,size,posi;
	cout<<"enter the size of a array\n";
	cin>>size;
	cout<<"\nenter the elements in the array\n";
	for(i=0;i<size;i++)
	{
	cin>>a[i];
	}
	cout<<"before deletion\n";
	for(i=0;i<size;i++)
	{
	cout<<endl<<a[i];
	}
	cout<<"\nenter the position in which the element to be deleted\n";
	cin>>posi;
	for(i=posi;i<size;i++)
	{
	a[i]=a[i+1];	
	}
	cout<<"after deletion";
	for(i=0;i<size-1;i++)
	{
 cout<<endl<<a[i];
	}
}
