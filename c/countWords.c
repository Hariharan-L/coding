#include <string.h>
#include <stdio.h>
int main()
{
  char a[40];
  int i, count = 1;
  gets(a);
  for (i = 0; i < strlen(a); i++)
  {
    if (a[i] == ' ' && a[i + 1] != ' ' && a[i + 1] != '\0')
    {
      count++;
    }
  }
  printf("%d", count);
  return 0;
}