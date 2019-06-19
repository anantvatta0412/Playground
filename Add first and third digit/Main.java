#include<stdio.h>
int main()
{
  //Type your code here
  int f,t,n,s;
  scanf("%d",&n);
  t=n%10;
  f=n/100;
  s=f+t;
  printf("%d",s);
  return 0;
}