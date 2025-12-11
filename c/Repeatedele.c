#include <stdio.h>

int main()
{
  int n, c = 1, i, j, flag, t;
  scanf("%d", &n);
  int arr[n], arr1[n];
  for (i = 1; i <= n; i++)
  {
    scanf("%d", &arr[i]);
  }
  for (i = 1; i <= n; i++)
  {
    flag = 0;
    for (j = 1; j <= n; j++)
    {
      if (i != j && arr[i] == arr[j])
      {
        for (t = 1; t < c; t++)
        {
          if (arr1[t] == arr[j])
          {
            flag = 1;
          }
        }
        if (flag != 1)
        {
          arr1[c++] = arr[j];
        }
      }
    }
  }

  for (j = 1; j < c; j++)
  {
    printf("%d ", arr1[j]);
  }
  return 0;
}
