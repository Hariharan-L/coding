#include <iostream>
using namespace std;
int main()
{
  int n, sum = 0;
  cout << "Input:\n";
  cin >> n;
  for (int i = 1; i <= n; i++)
  {
    sum += i;
  }
  cout << sum;
  cout << (3 >> 3);
  return 0;
}