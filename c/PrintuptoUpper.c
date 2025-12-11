#include <string.h>
#include <stdio.h>
int main()
{
  char a[40];
  int i;
  scanf("%s", a);
  for (i = 0; i < strlen(a); i++)
  {
    if ((int)a[i] <= 90)
    {
      //   printf("%c",a[i]);
      break;
    }
    else
    {
      printf("%c", a[i]);
    }
  }
  return 0;
}