#include <iostream>
#include <algorithm>
using namespace std;
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
  int k;
  cin >> k;
  if (binary_search(arr, arr + count, k))
  {
    cout << "yes";
  }
  else
  {
    cout << "No";
  }
}