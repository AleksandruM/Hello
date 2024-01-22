// Problemă 1. 
//     Se consideră un tabloul A[10][10] de numere întregi. Să se elaboreze un program care include următoarele funcţii:
// 	•	completează tabloul de la tastatură; 
// 	•	afişează elementele tabloului;
// 	•	găseşte elementul maxim din tablou;
// 	•	afişează câte elemente sunt impare pe fiecare coloană;
// 	•	afişeze suma elementelor amplasate sub de diagonala secundară.

import java.util.Scanner;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // completează tabloul de la tastatură
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Insertati elementul tabloului A[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // afişează elementele tabloului
        System.out.println("Tabloul A:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // găseşte elementul maxim din tablou
        int maxElement = matrix[0][0];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        System.out.println("Element maxim din tablou: " + maxElement);

        // afişează câte elemente sunt impare pe fiecare coloană
        for (int j = 0; j < 10; j++) {
            int count = 0;
            for (int i = 0; i < 10; i++) {
                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
            System.out.println("In coloana " + j + " suma elementelor impare: " + count);
        }

        // afişeze suma elementelor amplasate sub de diagonala secundară
        int sumBelowSecondDiag = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i > j + 1) {
                    sumBelowSecondDiag += matrix[i][j];
                }
            }
        }
        System.out.println("Suma elementelor, amplasate sub de diagonala secundară: " + sumBelowSecondDiag);
    }
}

// Exemplu:

// Insertati elementul tabloului A[0][0]: 1 2
// Insertati elementul tabloului A[0][1]: Insertati elementul tabloului A[0][2]: 2 4
// Insertati elementul tabloului A[0][3]: Insertati elementul tabloului A[0][4]: 2 5
// Insertati elementul tabloului A[0][5]: Insertati elementul tabloului A[0][6]: 1 6
// Insertati elementul tabloului A[0][7]: Insertati elementul tabloului A[0][8]: 2 4
// Insertati elementul tabloului A[0][9]: Insertati elementul tabloului A[1][0]: 2 7
// Insertati elementul tabloului A[1][1]: Insertati elementul tabloului A[1][2]: 1 2
// Insertati elementul tabloului A[1][3]: Insertati elementul tabloului A[1][4]: 3 4
// Insertati elementul tabloului A[1][5]: Insertati elementul tabloului A[1][6]: 5 6
// Insertati elementul tabloului A[1][7]: Insertati elementul tabloului A[1][8]: 2 3
// Insertati elementul tabloului A[1][9]: Insertati elementul tabloului A[2][0]: 4 6
// Insertati elementul tabloului A[2][1]: Insertati elementul tabloului A[2][2]: 1 2
// Insertati elementul tabloului A[2][3]: Insertati elementul tabloului A[2][4]: 3 3
// Insertati elementul tabloului A[2][5]: Insertati elementul tabloului A[2][6]: 2 1
// Insertati elementul tabloului A[2][7]: Insertati elementul tabloului A[2][8]: 2 3
// Insertati elementul tabloului A[2][9]: Insertati elementul tabloului A[3][0]: 4 5
// Insertati elementul tabloului A[3][1]: Insertati elementul tabloului A[3][2]: 1 2
// Insertati elementul tabloului A[3][3]: Insertati elementul tabloului A[3][4]: 3 6
// Insertati elementul tabloului A[3][5]: Insertati elementul tabloului A[3][6]: 3 8
// Insertati elementul tabloului A[3][7]: Insertati elementul tabloului A[3][8]: 2 3
// Insertati elementul tabloului A[3][9]: Insertati elementul tabloului A[4][0]: 4 5
// Insertati elementul tabloului A[4][1]: Insertati elementul tabloului A[4][2]: 1 2
// Insertati elementul tabloului A[4][3]: Insertati elementul tabloului A[4][4]: 3 6
// Insertati elementul tabloului A[4][5]: Insertati elementul tabloului A[4][6]: 3 4
// Insertati elementul tabloului A[4][7]: Insertati elementul tabloului A[4][8]: 2 2
// Insertati elementul tabloului A[4][9]: Insertati elementul tabloului A[5][0]: 1 1
// Insertati elementul tabloului A[5][1]: Insertati elementul tabloului A[5][2]: 2 4
// Insertati elementul tabloului A[5][3]: Insertati elementul tabloului A[5][4]: 2 2
// Insertati elementul tabloului A[5][5]: Insertati elementul tabloului A[5][6]: 1 3
// Insertati elementul tabloului A[5][7]: Insertati elementul tabloului A[5][8]: 9 1
// Insertati elementul tabloului A[5][9]: Insertati elementul tabloului A[6][0]: 0 2
// Insertati elementul tabloului A[6][1]: Insertati elementul tabloului A[6][2]: 1 0
// Insertati elementul tabloului A[6][3]: Insertati elementul tabloului A[6][4]: 3 3
// Insertati elementul tabloului A[6][5]: Insertati elementul tabloului A[6][6]: 4 5
// Insertati elementul tabloului A[6][7]: Insertati elementul tabloului A[6][8]: 3 2
// Insertati elementul tabloului A[6][9]: Insertati elementul tabloului A[7][0]: 1 2
// Insertati elementul tabloului A[7][1]: Insertati elementul tabloului A[7][2]: 4 5
// Insertati elementul tabloului A[7][3]: Insertati elementul tabloului A[7][4]: 9 9
// Insertati elementul tabloului A[7][5]: Insertati elementul tabloului A[7][6]: 3 4
// Insertati elementul tabloului A[7][7]: Insertati elementul tabloului A[7][8]: 2 5
// Insertati elementul tabloului A[7][9]: Insertati elementul tabloului A[8][0]: 4 1
// Insertati elementul tabloului A[8][1]: Insertati elementul tabloului A[8][2]: 2 0 
// Insertati elementul tabloului A[8][3]: Insertati elementul tabloului A[8][4]: 0 0
// Insertati elementul tabloului A[8][5]: Insertati elementul tabloului A[8][6]: 1 9
// Insertati elementul tabloului A[8][7]: Insertati elementul tabloului A[8][8]: 8 7
// Insertati elementul tabloului A[8][9]: Insertati elementul tabloului A[9][0]: 8 8
// Insertati elementul tabloului A[9][1]: Insertati elementul tabloului A[9][2]: 2 4
// Insertati elementul tabloului A[9][3]: Insertati elementul tabloului A[9][4]: 1 7
// Insertati elementul tabloului A[9][5]: Insertati elementul tabloului A[9][6]: 5 3
// Insertati elementul tabloului A[9][7]: Insertati elementul tabloului A[9][8]: 7 4
// Insertati elementul tabloului A[9][9]: Tabloul A:
// 1 2 2 4 2 5 1 6 2 4 
// 2 7 1 2 3 4 5 6 2 3 
// 4 6 1 2 3 3 2 1 2 3 
// 4 5 1 2 3 6 3 8 2 3 
// 4 5 1 2 3 6 3 4 2 2 
// 1 1 2 4 2 2 1 3 9 1 
// 0 2 1 0 3 3 4 5 3 2 
// 1 2 4 5 9 9 3 4 2 5 
// 4 1 2 0 0 0 1 9 8 7 
// 8 8 2 4 1 7 5 3 7 4 
// Element maxim din tablou: 9
// In coloana 0 suma elementelor impare: 3
// In coloana 1 suma elementelor impare: 5
// In coloana 2 suma elementelor impare: 5
// In coloana 3 suma elementelor impare: 1
// In coloana 4 suma elementelor impare: 7
// In coloana 5 suma elementelor impare: 5
// In coloana 6 suma elementelor impare: 8
// In coloana 7 suma elementelor impare: 5
// In coloana 8 suma elementelor impare: 3
// In coloana 9 suma elementelor impare: 6
// Suma elementelor, amplasate sub de diagonala secundară: 113



























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
















// Problemă 3. Să se elaboreze  un program care  implimentează recursiv funcţia de calcul a factorialului ( n!).

//Funcția factorial este definită ca o funcție statică care primește un argument de tip int și returnează un int.
// În interiorul funcției, verificăm dacă n este 0 sau 1. Dacă da, returnăm 1, altfel returnăm n * factorial(n-1).
class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
// În metoda main, apelăm funcția factorial cu n = 5 și afișăm rezultatul.
    public static void main(String[] args) {
        int n = 5;
        int fact = factorial(n);
        System.out.println("Factorialul lui " + n + " este " + fact);
    }
}

// Output:
// Factorialul lui 5 este 120


























// Problemă 4. Să se elaboreze  un program,  ce  implimentează recursiv funcţia de calcul şirul lui Fibonacci, care generează primii n termeni. Propuneți și alți algoritmi de calcul.

// Funcția fibonacci este definită ca o funcție statică care primește un argument de tip int și returnează un int.
// În interiorul funcției, verificăm dacă n este 0 sau 1. Dacă da, returnăm n, altfel returnăm suma dintre fibonacci(n-1) și fibonacci(n-2).

class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
// În metoda main, apelăm funcția fibonacci pentru primele n valori și le afișăm.    
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Primii " + n + " termeni ai sirului lui Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

// Output: 
//Primii 10 termeni ai sirului lui Fibonacci: 0 1 1 2 3 5 8 13 21 34 
