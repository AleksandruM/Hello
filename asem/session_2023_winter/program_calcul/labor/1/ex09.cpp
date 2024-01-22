#include <cstdio>

int main() {
  char name[100];
  int age;
  char address[100];

  printf("Enter name: ");
  scanf("%s", name);
  printf("Enter age: ");
  scanf("%d", &age);
  printf("Enter address: ");
  scanf("%s", address);

  printf("Ma numesc %s, am varsta %d si locuiesc %s.\n", name, age, address);

  return 0;
}