#include <math.h>
#include <stdio.h>
int count(int n);
void oddeven(int x, int m);
int main()
{ // not completed
  int num, num1, c;
  scanf("%d", &num);
  c = count(num);
  // printf("%d", c);
  num1 = pow(10, c - 1);
  // printf("%d", num1);
  oddeven(num, num1);
  return 0;
}
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
void oddeven(int x, int m)
{
  int t, b = 0, y = m, a = 0, s = 0;
  while (x > 0)
  {
    t = x / m;
    if (t % 2 == 0)
    {
      a = a * 10 + t;
      s++;
    }
    else
    {
      b = b * 10 + t;
    }
    x = x - (t * m);
    m = m / 10;
  }
  int f = pow(10, s);
  if (f == 0)
  {
    f = 1;
  }
  printf("%d", (b * f) + a);
}