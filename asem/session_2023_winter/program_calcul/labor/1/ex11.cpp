#include <iostream>

int main() {
  int x = 5;

  int x2 = x * x;
  int x5 = x2 * x2 * x;
  int x17 = x5 * x5 * x2 * x2 * x2;

  std::cout << "x^2: " << x2 << std::endl;
  std::cout << "x^5: " << x5 << std::endl;
  std::cout << "x^17: " << x17 << std::endl;

  return 0;
}