#include <iostream>
#include <cmath>
using namespace std;
int main()
{
  double w{7.7};
  double a{-90};
  double ex{10};
  int n{3};
  int m{5};
  double sq{81};
  cout << "Weighted rounded to floor is : " << floor(w) << endl;
  cout << "Weighted rounded to ceil is : " << ceil(w) << endl;
  cout << "Abs of the a : " << abs(a) << endl;
  cout << "Exponential of 10 : " << exp(ex) << endl;
  cout << "3^5" << pow(n, m) << endl;
  cout << "log 5 : " << log(m) << endl;
  cout << "log with base 10 : " << log10(m) << endl;
  cout << "The square root of 81 is : " << sqrt(sq) << endl;
  cout << "Rounded values : " << round(3.532352) << endl;
  cout << "Rounded values : " << round(2.4) << endl;
}