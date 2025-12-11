#include <string.h>
#include <stdio.h>
int main()
{
  int num, i;
  scanf("%d", &num);
  int num2 = num * num;
  int rev = 0;
  while (num > 0)
  {
    rev = rev * 10 + num % 10;
    num /= 10;
  }
  int rev1 = rev * rev;
  int rev2 = 0;
  while (rev1 > 0)
  {
    rev2 = rev2 * 10 + rev1 % 10;
    rev1 /= 10;
  }
  if (rev2 == num2)
  {
    printf("It is an adom number");
  }
  else
  {
    printf("It is not an adom number");
  }
  return 0;
}