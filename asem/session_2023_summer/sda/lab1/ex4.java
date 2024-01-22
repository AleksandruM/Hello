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
