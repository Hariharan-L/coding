#include <stdio.h>

int main()
{
  int n;
  scanf("%d", &n);
  int arr[n];
  for (int i = 1; i <= n; i++)
  {
    scanf("%d", &arr[i]);
  }
  int max = arr[1];
  for (int j = 2; j <= n; j++)
  {
    if (arr[j] > max)
    {
      max = arr[j];
    }
  }
  printf("%d", max);
  return 0;
}
