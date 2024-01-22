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