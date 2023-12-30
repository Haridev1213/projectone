//program name : Array Inserting a new value
#include<iostream>
using namespace std;
int main()
{
	int a[10],i,size,posi,num;
	cout<<"enter the size of the array ";
	cin>>size;
	for(i=0;i<size;i++)
	{
		cin>>a[i];
		
	}
	cout<<"before insertion";
	for(i=0;i<size;i++)
	{
		cout<<endl<<a[i];
	}
	cout<<"\nenter the position and number to insert an element";
	//cin>>posi;
	cin>>num;
	for(i=size-1;i>=0;i--)
	{
	a[i+1]=a[i];
       
    }
     a[0]=num;
		cout<<endl<<"after insertion";
		for(i=0;i<=size;i++)
		{
			cout<<endl<<a[i];
		}
		
	}

	

