#include <stdio.h>

int main()
{
  int n;
  scanf("%d", &n);
  int arr[n];
  for (int i = n; i >= 1; i--)
  {
    scanf("%d", &arr[i]);
  }
  // printf("%d", arr[5]);
  for (int j = 1; j <= n; j++)
  {
    printf("%d ", arr[j]);
  }
  return 0;
}
