#include <stdio.h>

int main()
{
  int n, re_ele;
  scanf("%d %d", &n, &re_ele);
  int arr[n];
  for (int i = 1; i <= n; i++)
  {
    scanf("%d", &arr[i]);
  }
  for (int j = 1; j <= n; j++)
  {
    if (arr[j] == re_ele)
    {
      arr[j] = arr[j + 1];
      j++;
    }
  }
  for (int j = 1; j <= n; j++)
  {
    printf("%d ", arr[j]);
  }
  return 0;
}
