#include <stdio.h>
int main() {
  int i, n, d=0,c,c2,f=1,s=0,l;
  scanf("%d",&n);
  c=n;
  c2=c;

  while(c>0)
  {
    l=c%10;
    for(i=1;i<=l;i++)
    {
      f=f*i;
    }
    s=s+f;
    c=c/10;
    f=1;
  }
  if(s==c2)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
  return 0;
}