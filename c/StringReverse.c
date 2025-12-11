#include <stdio.h>
#include <string.h>
int main()
{
  char a[40], b[40];
  gets(a);
  int i, count = 0;
  int j = strlen(a);
  for (i = 0; i < strlen(a) + 1; i++)
  {
    b[j] = a[i];
    j--;
  }
  for (int k = 0; k < strlen(a) + 1; k++)
  {
    printf("%c", b[k]);
  }
  return 0;
}