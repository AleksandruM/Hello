#include <stdio.h>
#include <string.h>

struct Calculator {
    char seria[20];
    char producator[20];
    float pret;
    int RAM;
};

int main() {
    int n, index = 0;
    float maxRAM = 0;
    char producatorMaxRAM[20];
    printf("Numarul de calculatoare: ");
    scanf("%d", &n);
    struct Calculator calculatoare[n];

    for (int i = 0; i < n; i++) {
        printf("Seria calculatorului: ");
        scanf("%s", calculatoare[i].seria);
        printf("Producator calculatorului: ");
        scanf("%s", calculatoare[i].producator);
        printf("Pret calculatorului: ");
        scanf("%f", &calculatoare[i].pret);
        printf("RAM calculatorului: ");
        scanf("%d", &calculatoare[i].RAM);
    }

    for (int i = 0; i < n; i++) {
        if (calculatoare[i].RAM > maxRAM) {
            maxRAM = calculatoare[i].RAM;
            strcpy(producatorMaxRAM, calculatoare[i].producator);
        }
    }

    printf("Producatorul cu cea mai mare memorie RAM: %s\n", producatorMaxRAM);

    return 0;
}
