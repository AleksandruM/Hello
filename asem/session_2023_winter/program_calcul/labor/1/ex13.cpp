#include <iostream>
#include <cmath>

int main() {
  double a = 3.0;
  double b = 4.0;

  double c = sqrt(a * a + b * b);
  double area = 0.5 * a * b;

  std::cout << "Hypotenuse: " << c << std::endl;
  std::cout << "Area: " << area << std::endl;

  return 0;
}