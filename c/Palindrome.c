#include <string.h>
#include <stdio.h>
int main()
{
  char a[34], b[34];
  gets(a);
  int l = strlen(a) - 1, i, j, flag = 0;
  strcpy(b, a);
  for (i = 0, j = l; i < l, j >= 0; i++, j--)
  {
    if (a[i] != b[j])
    {
      flag = 1;
    }
  }
  if (flag == 0)
  {
    printf("yes");
  }
  else
  {
    printf("No");
  }
  return 0;
}