#include <iostream>

int main() {
  int a = 10;
  float b = 20.5;
  double c = 30.25;

  double sum = a + b + c;
  double product = a * b * c;

  std::cout << "Sum: " << sum << std::endl;
  std::cout << "Product: " << product << std::endl;

  return 0;
}