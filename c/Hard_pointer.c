#include <stdio.h>
int main()
{
  int a[] = {4, 14, 24, 34};
  int b[] = {6, 16, 26, 36};
  int c[] = {9, 19, 29, 39};
  int *p[3], **ptr, i;
  p[0] = a;
  p[1] = b;
  p[2] = c;
  ptr = p;
  for (i = 1; i <= 3; i++)
  {
    *ptr = *ptr + i;
    **ptr = **ptr + i;
    printf("%d", **ptr);
    ++ptr;
  }
  --ptr;
}