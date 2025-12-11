#include <stdio.h>

int main()
{
  int n, in, ele;
  scanf("%d", &n);
  scanf("%d %d", &in, &ele);
  int arr[n];
  for (int i = 1; i <= n; i++)
  {
    scanf("%d", &arr[i]);
  }
  for (int i = 1; i <= n; i++)
  {
    if (i == in)
    {
      for (int j = n; j >= i; j--)
      {
        arr[j + 1] = arr[j];
      }
      arr[in] = ele;
    }
  }
  for (int j = 1; j <= n + 1; j++)
  {
    printf("%d ", arr[j]);
  }
  return 0;
}
