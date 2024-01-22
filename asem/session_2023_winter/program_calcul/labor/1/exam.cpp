#include <iostream>
#include <string>

using namespace std;

class Apartament
{
public:
    Apartament(string localitate, int numarApartament, int numarScara, int suprafata, bool telefon, string numePrenume)
        : localitate(localitate), numarApartament(numarApartament), numarScara(numarScara),
          suprafata(suprafata), telefon(telefon), numePrenume(numePrenume) {}

    string getLocalitate() const { return localitate; }

private:
    string localitate;
    int numarApartament;
    int numarScara;
    int suprafata;
    bool telefon;
    string numePrenume;
};

int main()
{
    int n;
    cout << "Introduceti numarul de apartamente: