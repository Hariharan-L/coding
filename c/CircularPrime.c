#include <stdio.h>
#include <math.h>
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
int fun1(int n)
{
  int r = 0;
  for (int i = 2; i < n; i++)
  {
    if (n % i == 0)
    {
      r = 1;
    }
  }
  if (r == 0)
  {
    return 1;
  }
  else
  {
    return 0;
  }
}
int main()
{
  int num1, i;
  scanf("%d", &num1);
  int c = count(num1), x = c - 1, p;
  while (c != 0)
  {
    i = num1 % 10;
    i = i * pow(10, x); /**********PLEASE RUN THIS IN ONLINE GDB**********/
    num1 = num1 / 10;
    num1 = num1 + i;
    p = fun1(num1);
    c--;
  }
  if (p == 1)
  {
    printf("Yes all are prime");
  }
  else
  {
    printf("No not all are prime");
  }
  return 0;
}
