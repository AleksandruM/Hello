#include <stdio.h>
#include <string.h>

int main() {
    char propozitie[100];
    int numarCuvinte = 1;

    printf("Introduceti propozitia: ");
    fgets(propozitie, sizeof(propozitie), stdin);
    propozitie[strlen(propozitie) - 1] = '\0'; // Eliminați \n introdus de fgets

    // Determinarea numărului de cuvinte din propoziție
    for (int i = 0; i < strlen(propozitie); i++) {
        if (propozitie[i] == ' ') {
            numarCuvinte++;
        }
    }

    printf("Numarul de cuvinte din propozitie este: %d\n", numarCuvinte);

    // Înlocuirea spațiilor cu *
    for (int i = 0; i < strlen(propozitie); i++) {
        if (propozitie[i] == ' ') {
            propozitie[i] = '*';
        }
    }

    printf("Propozitia dupa inlocuirea spatiilor este: %s\n", propozitie);
    return 0;
}
