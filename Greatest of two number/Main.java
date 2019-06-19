#include<stdio.h>
int main()
{
  //Type your code here
  int a,b;
  scanf("%d",&a);
  scanf("%d",&b);
  if(a>b)
  {
    printf("num1 is the greatest");
  }
  else if(b>a)
  {
    printf("num2 is the greatest");
  }
  else
  {
    printf("Both number equal");
  }
  return 0;
}