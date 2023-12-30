//program name :Nested for factorial
#include<iostream>
using namespace std;
int main()
{
	int a,i,j,fact=1;
	for(i=1;i<2;i++)
	{
		cout<<"enter the numbers";
		cin>>a;
		for(j=1;j<=a;j++)
		{
		fact=fact*j;	
		}
	}
	cout<<fact;
}
