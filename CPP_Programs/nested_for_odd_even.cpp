//program name :Nested for odd and even
#include<iostream>
using namespace std;
int main()
{
	int a,i,j;
	for(i=1;i<2;i++)
	{
		cout<<"enter the numbers";
		cin>>a;
		for(j=1;j<2;j++)
		{
			if(a%2==0)
			{
				cout<<"even";
			}
			else
			{
				cout<<"odd";
			}
		}
	}
}
