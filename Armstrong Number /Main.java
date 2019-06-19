#include <stdio.h>
#include <math.h>
int main() {
  int i, n, c, l, c2, a=0, d=0;
  scanf("%d",&n);
  c=n;
  c2=c;
  while(n>0)
  {
    d=d+1;
    n=n/10;
  }
  while(c>0)
  {
    l=c%10;
    a=(a+pow(l,d));
    c=c/10;
  }
  if(c2==a)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
  return 0;
}