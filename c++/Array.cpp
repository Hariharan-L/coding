#include <iostream>
#include <vector>
using namespace std;
int main()
{
  // int count, sum = 0;
  // cout << "Input:\n";
  // cin >> count;
  // vector<int> arr;
  // arr.resize(count);
  // for (int i = 0; i < arr.size(); i++)
  // {
  //   cin >> arr[i];
  //   sum += arr[i];
  // }
  // cout << "\n"
  //      << sum;
  /*values of array*/
  // int value[]{1, 2, 3, 4, 5, 6, 7, 8};
  // int count{size(value)};
  // for (size_t i{0}; i < 10; ++i)
  // {
  //   cout << "scores : " << value[i] << endl;
  // }
  // /*Size of the array and a single variable*/
  // cout << sizeof(value[0]) << endl;
  // cout << sizeof(value);
  /***********Character array*************/
  char mes[]{
      'h',
      'e',
      'l',
      'l',
      'o',
  };
  for (/*use auto*/ char c : mes)
  {
    cout << c << endl;
  }
  cout << sizeof(mes) << endl;
  cout << sizeof(mes[0]);
}