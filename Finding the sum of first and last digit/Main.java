#include <stdio.h>
int main() {
  int num, first, last, sum;
  scanf("%d", &num);
  first = num;
  while (first >= 10)
  {
    first = first / 10;
  }
  last = num % 10;
  sum = first + last;
  printf("%d",sum);
  return 0;
}