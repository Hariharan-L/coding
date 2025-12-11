#include <iostream>
#include <iomanip>
#include <ios>
using namespace std;

int main()
{
  int num{20}; // assinment can be done by these type also
  cout << "--------------------\n";
  cout << setw(num) << "first" << endl;
  cout << setw(num) << "hark" << endl;
  cout << setw(num) << "mama" << endl;
  cout << setw(num) << "kutty" << endl;
  cout << setw(num) << "knight" << endl;
  cout << setfill('*');
  cout << left;
  cout << setw(num) << "toxic " << endl;
  cout << setw(num) << "last " << endl;
  cout << setw(num) << "shark " << endl;
  cout << setw(num) << "empty " << endl;
  cout << setw(num) << "same " << endl;
  cout << "--------------------\n";
  cout << hex << num << endl;
  cout << oct << num << endl;
  cout << dec << num << endl;
  cout << "---------showbase-----------\n";
  cout << showbase;
  cout << hex << num << endl;
  cout << oct << num << endl;
  cout << dec << num << endl;
  double a{3.789564332567};
  double b{7009.8};
  double c{3.9e-10};
  double n{4.44};
  double m{1.9000};
  cout << "--------------------\n";
  cout << "a : " << a << endl;
  cout << "b : " << b << endl;
  cout << "c : " << c << endl;
  cout << "---------fixed-----------\n";
  cout << fixed;
  cout << "a : " << a << endl;
  cout << "b : " << b << endl;
  cout << "c : " << c << endl;
  cout << "---------scientific-----------\n";
  cout << scientific;
  cout << "a : " << a << endl;
  cout << "b : " << b << endl;
  cout << "c : " << c << endl;
  cout << fixed;
  cout << "-----setprecision-----\n";
  cout << setprecision(4);
  cout << "a : " << a << endl;
  cout << setprecision(6);
  cout << "a : " << a << endl;
  cout << "-----show point-----\n";
  cout << showpoint;
  cout << "n : " << n << endl;
  cout << "m : " << m << endl;
  cout << "-----show point-----\n";
  return 0;
}