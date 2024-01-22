// Problemă 1. 
//     Se consideră un tabloul A[10][10] de numere întregi. Să se elaboreze un program care include următoarele funcţii:
// 	•	completează tabloul de la tastatură; 
// 	•	afişează elementele tabloului;
// 	•	găseşte elementul maxim din tablou;
// 	•	afişează câte elemente sunt impare pe fiecare coloană;
// 	•	afişeze suma elementelor amplasate sub de diagonala secundară.

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


