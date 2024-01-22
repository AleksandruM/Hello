#include <iostream>
using namespace std;

int main() {
    char caractere[100];
    int numarVocale = 0;
    int n;

    cout << "Introduceti numarul de caractere: ";
    cin >> n;
    cout << "Introduceti caracterele: ";
    for (int i = 0; i < n; i++) {
        cin >> caractere[i];
    }

    for (int i = 0; i < n; i++) {
        if (caractere[i] == 'a'  caractere[i] == 'e'  caractere[i] == 'i'  caractere[i] == 'o'  caractere[i] == 'u'  caractere[i] == 'A'  caractere[i] == 'E'  caractere[i] == 'I'  caractere[i] == 'O' || caractere[i] == 'U') {
            numarVocale++;
        }
    }

    cout << "Numarul de vocale este: " << numarVocale << endl;
    return 0;
}
