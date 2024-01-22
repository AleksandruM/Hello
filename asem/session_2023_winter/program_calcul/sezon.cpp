#include <stdio.h>

int main() {
    int numarSaptamana;

    printf("Introduceti numarul de ordine al saptamanii din an: ");
    scanf("%d", &numarSaptamana);

    switch (numarSaptamana) {
        case 1: case 2: case 12:
            printf("Sezonul este iarna.\n");
            break;
        case 3: case 4: case 5:
            printf("Sezonul este primavara.\n");
            break;
        case 6: case 7: case 8:
            printf("Sezonul este vara.\n");
            break;
        case 9: case 10: case 11:
            printf("Sezonul este toamna.\n");
            break;
    default:
      printf("Numarul de saptamana introdus este invalid.\n");
      break;
    }
    return 0;
}
