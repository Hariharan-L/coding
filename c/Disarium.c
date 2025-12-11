#include <math.h>
#include <stdio.h>
int count(int n)
{
  int t = 0;
  while (n > 0)
  {
    n = n / 10;
    t++;
  }
  return t;
}
int main()
{
  int n, c, x, s = 0;
  scanf("%d", &n);
  int y = n;
  c = count(n);
  while (n > 0) /////////////////////////////not working work in gdb/////////////////
  {
    x = n % 10;
    s = s + pow(x, c);
    n = n / 10;
    c--;
  }
  if (s == y)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
  return 0;
}
