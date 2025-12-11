#include <stdio.h>

int main()
{
  int n, i, j, flag = 0;
  scanf("%d", &n);
  int arr[n];
  for (i = 1; i <= n; i++)
  {
    scanf("%d", &arr[i]);
  }
  for (i = 1; i <= n; i++)
  {
    if (arr[i + 1] == arr[i])
    {
      flag += 1;
    }
  }
  if (flag >= 1)
  {
    printf("It is not a lucky number");
  }
  else
  {
    printf("it is a lucky number");
  }
  return 0;
}