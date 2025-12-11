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
  int n1, m, i, x, c, s = 0;
  scanf("%d", &n1);
  scanf("%d", &m);
  for (i = n1; i <= m; i++)
  {
    c = count(i);
    int cop = i;
    while (cop > 0)
    {
      x = cop % 10;
      s = s + pow(x, c);
      cop = cop / 10;
    }
    if (i == s)
    {
      printf("%d-ams\n", i);
    }
    s = 0;
  }
  return 0;
}