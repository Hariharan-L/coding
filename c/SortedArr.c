#include <stdio.h>

int main()
{
  int n, m, k, c = 0, swap;
  scanf("%d %d", &n, &m);
  k = m + n;
  int arr1[n], arr2[m];
  for (int i = 1; i <= n; i++)
  {
    scanf("%d", &arr1[i]);
  }
  for (int j = 1; j <= m; j++)
  {
    scanf("%d", &arr2[j]);
  }
  int arr3[k];
  for (int i = 1; i <= n; i++)
  {
    arr3[i] = arr1[i];
    c += 1;
  }
  for (int j = 1; j <= m; j++)
  {
    arr3[c + 1] = arr2[j];
    c += 1;
  }
  for (int i = 1; i <= c; i++)
  {
    for (int j = i + 1; j <= c; j++)
    {
      if (arr3[i] < arr3[j])
      {
        swap = arr3[j];
        arr3[j] = arr3[i];
        arr3[i] = swap;
      }
    }
  }
  for (int j = 1; j <= c; j++)
  {
    printf("%d ", arr3[j]);
  }
  return 0;
}
