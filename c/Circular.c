#include <stdio.h>
#include <math.h>
int count(int n)
{
  int t = 0;
  while (n > 0)
  {
    n = n / 10;
    t++;
  }
  return t;
} /**********************PLEASE RUN TIS FILE IN ONLINEGDB*************************************/
int main()
{
  int num1, num2, i;
  scanf("%d", &num1);
  scanf("%d", &num2);
  int c = count(num1), x = c - 1, p = 0;
  while (c != 0)
  {
    if (num1 == num2)
    {
      p = 1;
      break;
    }
    else
    {
      i = num1 % 10;
      i = i * pow(10, x);
      num1 = num1 / 10;
      num1 = num1 + i;
    }
    c--;
  }
  if (p == 1)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
  return 0;
}
