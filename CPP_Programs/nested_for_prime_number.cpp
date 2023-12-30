//program name: nested for prime number
#include<iostream>
using namespace std;
int main()
{

	int a,i,j,b=2;
	for(i=1;i<2;i++)
	{
		cout<<"enter the number";
		cin>>a;
		for(j=1;j<2;j++)
		{
			while(a>b)
			{
				if(a%b==0)
				{			
				cout<<"the given number is not a prime number";
				break;
			}
				b++;
			}
			
		}
		if(a/b==1)
		{
			cout<<"the give number is a prime number";
		}
	

