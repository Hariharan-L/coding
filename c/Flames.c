
#include <stdio.h>

int main()
{
  int n = 5, c = 0, i, m = 0;
  char a[6] = {'f', 'l', 'a', 'm', 'e', 's'};
  while (1)
  {
    for (i = 0; i < 6; i++)
    {
      if (a[i] != '*')
      {
        c += 1;
      }

      if (c == n)
      {
        a[i] = '*';
        m++;
        c = 0;
      }
    }
    if (m == 5)
    {
      break;
    }
  }
  for (i = 0; i < 6; i++)
  {
    if (a[i] == '*')
    {
    }
    else
    {
      printf("%c", a[i]);
      break;
    }
  }
  return 0;
}
