#include <cstdio>

int main() {
  char first_name[100];
  char last_name[100];

  printf("Enter name and surname: ");
  scanf("%s %s", first_name, last_name);

  printf("Name: %s\n", first_name);
  printf("Surname: %s\n", last_name);

  return 0;
}