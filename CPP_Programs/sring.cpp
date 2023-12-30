//program name : string compare and string length
#include<iostream>
#include<string.h>
using namespace std;
int main()
{
char a[20],b[20];
cout<<"enter the name =";
gets(a);
cout<<"enter the name =";
gets(b);
cout<<strlen(a)<<endl;
cout<<strcmp(a,b);
}	
