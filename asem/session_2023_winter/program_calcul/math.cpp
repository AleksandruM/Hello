#include <stdio.h>
#include <math.h>

int main() {
    int numar1, numar2;

    printf("Introduceti primul numar intreg: ");
    scanf("%d", &numar1);

    printf("Introduceti al doilea numar intreg: ");
    scanf("%d", &numar2);

    if (numar1 < abs(numar2)) {
        numar1 = numar1 / 10;
    } else {
        numar1 = pow(numar1, 2);
        numar2 = pow(numar2, 2);
    }

    printf("Numarul 1: %d\n", numar1);
    printf("Numarul 2: %d\n", numar2);
    return 0;
}