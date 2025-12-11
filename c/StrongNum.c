#include <stdio.h>
int factorial(int a)
{
  int t = 1, i;
  for (i = a; i > 0; i--)
  {
    t = t * i;
  }
  return t;
}
int main()
{
  int n, m, x, s = 0;
  scanf("%d", &n);
  m = n;
  while (m > 0)
  {
    x = m % 10;
    s = s + factorial(x);
    m = m / 10;
  }
  if (n == s)
  {
    printf("%d-Strong Number", n);
  }
  else
  {
    printf("no");
  }

  return 0;
}
