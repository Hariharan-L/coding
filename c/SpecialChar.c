#include <string.h>
#include <stdio.h>
int main()
{
  char a[40];
  int i, count = 0;
  scanf("%s", a);
  for (i = 0; i < strlen(a); i++)
  {
    if ((a[i] >= 'a' && a[i] <= 'z') || (a[i] >= 'A' && a[i] <= 'Z') || (a[i] >= '0' && a[i] <= '9'))
    {
      count++;
    }
  }
  printf("%d", strlen(a) - count);
  return 0;
}