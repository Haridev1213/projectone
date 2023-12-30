//program name : ATM concept
#include<iostream>
using namespace std;
class Atm
{
	public:
	int a;
	void at()
	{
	cout<<"enter the card";
cin>>a;
if(a!=0)
{
	cout<<"checking the account details\n";	
    cout<<"the given details are correct press 1 to continue"; 
}
else
{
	cout<<"reinsert the card\n";
}
int a1;
cin>>a1;
if(a1!=0)
{
cout<<"\n1 Deposit"<<endl<<"2 withdraw"<<endl<<"3 Balance checking"<<endl<<"4 transfer money\n";
cout<<"enter the number\n";
int swi,b;
cin>>b;
switch(b)
	{
	case 1:
	int c,d;
	cout<<"enter the pin\n";
	cin>>c;
	if(c==1234)
	{
		cout<<"deposit the amount\n";
		cin>>d;
		if(d!=0)
		{
			cout<<"total amount for depositing=  "<<d;
			cout<<"\nthe money to be transfer to your account\n";
			
		}
		else
		{
			cout<<"there is no cash to deposit\n";
		}
	}
else
	{
	cout<<"the pin is wrong and re enter the pin\n ";
	}
	break;
	case 2:
		int w,w1;
		cout<<"enter the pin\n";
		cin>>w1;
		if(w1==1234)
{
	cout<<"the pin is correct"<<endl;		
	cout<<"enter the amount to withdraw\n ";
	cin>>w;
cout<<"withdraw amount is = "<<w<<endl;
	if(w>=100&&w<=2000)
	{
		cout<<"pleace take the amount\n ";
	}
	else
	{
		cout<<"there is less money for u required\n";
	}
}
else
{
	cout<<"enterd pin is wrong";
	}	break;
case 3:
	int b1;
cout<<"enter the pin";
cin>>b1;
if(b1==1234)
{
	cout<<"your bank balance details\n ";	
}
else
{
	cout<<"entered pin is wrong";
}
break;
case 4:
	int t,t1,t2;
cout<<"entered the account number to transfer\n";
cin>>t;	
cout<<"enter the pin";
cin>>t1;
if(t1==1234)
{
	cout<<"enter the amount to be transfer\n";
	cin>>t2;
	cout<<"amount can be transfered to account\n";
}
else
{
	cout<<"the pin is wrong";
}
break;
default:
cout<<"the machine is busy";
}}}};
int main()
{
Atm t;
t.at();
}


