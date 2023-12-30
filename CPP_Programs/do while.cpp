//program name: do while loop factorial
#include<iostream>
using namespace std;
int main()
{
int a,fact=1,i=1;
cout<<"enter the factorial number\n";
cin>>a;
do
{
	fact=fact*i;
	i++;
}while(i<=a);
	cout<<fact;
	
} 
