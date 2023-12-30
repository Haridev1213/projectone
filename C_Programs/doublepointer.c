#include<stdio.h>
void main()
{
int a=10,*p,**q;
p=&a;
q=&p;
printf("%d the address of a\n",a);
printf("%d the address of p\n",*p);
printf("%d the address of q\n",**q);
}
