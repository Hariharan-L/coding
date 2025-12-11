#include <string.h>
#include <stdio.h>
int main()
{
  char a[34], b[34];
  gets(a);
  gets(b);
  int l, m;
  l = strlen(a);
  m = strlen(b);
  int tot = l + m, i, j;
  char c[tot];
  for (i = 0; i < l; i++)
  {
    c[i] = a[i];
  }
  for (i = l, j = 0; i < tot, j < m; i++, j++)
  {
    c[i] = b[j];
  }
  puts(c);
  return 0;
}