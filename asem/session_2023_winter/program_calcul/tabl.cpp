#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    const int SIZE = 200;
    int tablou[SIZE];
    int elementMaxim, contorMaxim = 0, produsMic = 1;

    // Initializarea tabloului cu valori aleatoare
    srand(time(NULL));
    for (int i = 0; i < SIZE; i++) {
        tablou[i] = (rand() % 201) - 100; // valori între -100 și 100
    }

    // Calcularea elementului maxim și a numărului de apariții a acestuia
    elementMaxim = tablou[0];
    for (int i = 1; i < SIZE; i++) {
        if (tablou[i] > elementMaxim) {
            elementMaxim = tablou[i];
            contorMaxim = 1;
        } else if (tablou[i] == elementMaxim) {
            contorMaxim++;
        }
    }

    // Calcularea produsului numerelor mai mici ca elementul maxim
    for (int i = 0; i < SIZE; i++) {
        if (tablou[i] < elementMaxim) {
            produsMic *= tablou[i];
        }
    }

    printf("Elementul maxim din tablou este: %d\n", elementMaxim);
    printf("Numarul de aparitii al acestuia: %d\n", contorMaxim);
    printf("Produsul numerelor mai mici decat elementul maxim : %d\n", produsMic);

    return 0;
}