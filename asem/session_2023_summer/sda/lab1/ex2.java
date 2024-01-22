// Problemă 2. Se consideră tab[n] de n numere întregi, unde n<100, domeniul de valori – -50  +50. Tabloul se completează cu ajutorul generatorului de numere aleatoare.  În toate consecutivităţile de numere pozitive  să se schimbe cu locul primul cu ultimul element.
// Notă:
// 	•	0 este considerat număr pozitiv; 
// 	•	consecutivitatea se consideră şirul ce include nu mai puţin de două elemente;

// În primul rând, inițializăm tabloul cu n elemente și generăm numere aleatoare între -50 și 50 cu ajutorul clasei Random.

import java.util.Random;

class SchimbaPozitiv {
    public static void main(String[] args) {
        int n = 10; // numarul de elemente din tablou
        int[] tab = new int[n]; // initializam tabloul cu n elemente
        
        // generam numere aleatoare intre -50 si 50 si le adaugam in tablou
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            tab[i] = rand.nextInt(101) - 50;
        }
// Apoi, afișăm tabloul inițial.        
        System.out.println("Tabloul initial: ");
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i] + " ");
        }
        
// schimbam pozitia primului si ultimului element din fiecare consecutivitate de numere pozitive
        int i = 0;
        while (i < n) {
            if (tab[i] >= 0) {
                int j = i + 1;
                while (j < n && tab[j] >= 0) {
                    j++;
                }
                if (j - i > 1) {
                    int temp = tab[i];
                    tab[i] = tab[j-1];
                    tab[j-1] = temp;
                }
                i = j;
            } else {
                i++;
            }
        }
        
        System.out.println("\nTabloul dupa schimbarea pozitiilor: ");
        for (int j = 0; j < n; j++) {
            System.out.print(tab[j] + " ");
        }
    }
}
// Dupa compilare:
// Tabloul initial: 
// -1 -17 0 15 25 44 12 -16 -20 38 
// Tabloul dupa schimbarea pozitiilor: 