//Name: Hari    Date : 9.11.2021   Program Name: print 5 digit number in sequence
#include<iostream>
using namespace std;
int main()
{
int a,b,c,d,e,f,g,h,i,j,k;
cout<<"enter the value of 5 digit number\n";
cin>>a;
b=a%10;
c=a/10;
d=c/10;
e=c%10;
f=d/10;
g=d%10;
h=f/10;
i=f%10;
j=h/10;
k=h%10;
cout<<k<<endl<<i<<endl<<g<<endl<<e<<endl<<b;	
}
