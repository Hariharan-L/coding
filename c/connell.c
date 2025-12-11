#include <stdio.h>

int main()
{
  int n, i, j, x = 1, c = 0;
  scanf("%d", &n);
  for (i = 1; i <= n; i++)
  {
    for (j = 1; j <= i; j++)
    {
      if (c < n)
      {
        printf("%d ", x);
        c++;
      }
      else
      {
        break;
      }
      x = x + 2;
    }
    x = x - 1;
  }
  return 0;
}