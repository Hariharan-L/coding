#include <stdio.h>

int main()
{
  int num, i, s = 0;
  scanf("%d", &num);
  for (i = 1; i <= num; i++)
  {
    if (num % i == 0)
    {
      s += i;
    }
  }
  int y = 0;
  while (s > 0)
  {
    int x;
    x = s % 10;
    if (x % 2 != 0)
    {
      y = y + x;
    }
    s = s / 10;
  }
  printf("%d", y);
  return 0;
}