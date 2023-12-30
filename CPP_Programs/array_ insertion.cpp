//program name : Array insertion
#include<iostream>
using namespace std;
int main()
{
int a[100],size,position,i,num;
cout<<"enter the sizeof the array";
cin>>size;
for(i=0;i<size;i++)
{
	cout<<"enter the elements of the array";
	cin>>a[i];
}
for(i=0;i<=size;i++)
{
	cout<<a[i];
	
}
cout<<"enter the position and number";
cin>>position>>num;
for(i=size-1;i>=position-1;i--)
{
a[i+1]=a[i];
}
a[position-1]=num;
cout<<"after inserting";
for(i=0;i<=size;i++)
{
	cout<<a[i];
}
}


