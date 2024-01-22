#include <stdio.h>
#include <stdbool.h>
int main() {
    int numar1, numar2;
    _Bool T;

    printf("Introduceti primul numar intreg: ");
    scanf("%d", &numar1);

    printf("Introduceti al doilea numar intreg: ");
    scanf("%d", &numar2);

    if (numar1 == numar2) {
        T = 1;
    } else {
        T = 0;
    }

    printf("\nNumerele sunt egale? %d\n", T);
    return 0;
}
