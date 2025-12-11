#include <string.h>
#include <stdio.h>
int main()
{
  char a[40];
  int i, j, count = 1;
  gets(a);
  for (i = 0; i < strlen(a); i++)
  {
    for (j = i + 1; j < strlen(a); j++)
    {
      if (a[i] == a[j])
      {
        if (a[i] == '*' || a[j] == '*')
        {
          continue;
        }
        else
        {
          a[j] = '*';
          count++;
        }
      }
    }
    if (a[i] != '*' && a[i] != ' ')
    {
      printf("%c-%d\n", a[i], count);
    }

    count = 1;
  }
  return 0;
}