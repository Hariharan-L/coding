#include <iostream>
using namespace std;
void swap(int *, int *);
int main()
{
  int a = 9, b = 1;
  cout << "a = " << a << "  b = " << b << "\n";
  swap(&a, &b);
  cout << "a = " << a << "  b = " << b;
}
void swap(int *x, int *y)
{
  int t;
  t = *x;
  *x = *y;
  *y = t;
}

/*
#include <iostream>
using namespace std;
void swap(int &, int &);
int main()
{
  int a = 9, b = 1;
  cout << "a = " << a << "  b = " << b << "\n";
  swap(a, b);
  cout << "a = " << a << "  b = " << b;
}
void swap(int &x, int &y)
{
  int t;
  t = x;
  x = y;
  y = t;
}
*/