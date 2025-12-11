#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
bool compare(int a, int b) /***********Without using this compare you can sort ascending order*************/
{
  return (a < b);
}
int main()
{
  int count, sum = 0;
  cout << "Input:\n";
  cin >> count;
  int arr[count];
  for (int i = 0; i < count; i++)
  {
    cin >> arr[i];
    sum += arr[i];
  }
  sort(arr, arr + count, compare);
  for (int i = 0; i < count; i++)
  {
    cout << arr[i];
  }
}