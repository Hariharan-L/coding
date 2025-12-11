#include <stdio.h>
/*******DETERMINENT OF 2 MATRIX******/
int main()
{
  int n, i, k, j, m, ele = 0;
  scanf("%d", &n);
  int arr1[n][n];
  for (i = 0; i < n; i++)
  {
    for (j = 0; j < n; j++)
    {
      scanf("%d", &arr1[i][j]);
    }
  }
  scanf("%d", &m);
  int arr2[m][m];
  for (i = 0; i < m; i++)
  {
    for (j = 0; j < m; j++)
    {
      scanf("%d", &arr2[i][j]);
    }
  }
  int arr3[m][m];
  for (i = 0; i < m; i++)
  {
    for (j = 0; j < m; j++)
    {
      ele = 0;
      for (k = 0; k < m; k++)
      {
        ele += arr1[i][k] * arr2[k][j];
      }
      arr3[i][j] = ele;
    }
  }
  for (i = 0; i < n; i++)
  {
    for (j = 0; j < n; j++)
    {
      printf("%d ", arr3[i][j]);
    }
    printf("\n");
  }

  return 0;
}
