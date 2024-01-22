// Problema 1 ( Obligatoriu)
// Sunt date numerele naturale n (n<=20) și m ( m <=n) care se introduc de la tastatură.
// Se cere de alcătuit un program care:
// a) Să găsească numărul de permutări ale acestei mulțimi;
// b) Să găsească numărul de combinări formate din m <=n elemente ale acestei mulțimi;
// c) Să găsească numărul de aranjamente formate din m <=n elemente ale acestei mulțimi



// Folosim formulele matematice pentru permutări, combinații, aranjamente.





// a) Numărul de permutări ale unei mulțimi de n elemente este factorialul lui n, n!. Pentru a găsi numărul de permutări ale mulțimii, folosim următorul cod:


// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Introduceti n: ");
//         int n = scanner.nextInt();
//         int permutari = factorial(n);
//         System.out.println("Numarul de permutari este: " + permutari);
//     }

//     public static int factorial(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         } else {
//             return n * factorial(n-1);
//         }
//     }
// }





// b) Numărul de combinații de m elemente dintr-o mulțime de n elemente este dat de formula C(n,m) = n! / (m! * (n-m)!). Pentru a găsi numărul de combinații, folosim următorul cod:


// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Introduceti n: ");
//         int n = scanner.nextInt();
//         System.out.print("Introduceti m: ");
//         int m = scanner.nextInt();
//         int combinatii = factorial(n) / (factorial(m) * factorial(n-m));
//         System.out.println("Numarul de combinatii este: " + combinatii);
//     }

//     public static int factorial(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         } else {
//             return n * factorial(n-1);
//         }
//     }
// }






// c) Numărul de aranjamente de m elemente dintr-o mulțime de n elemente este dat de formula A(n,m) = n! / (n-m)!. Pentru a găsi numărul de aranjamente, folosim următorul cod:


// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Introduceti n: ");
//         int n = scanner.nextInt();
//         System.out.print("Introduceti m: ");
//         int m = scanner.nextInt();
//         int aranjamente = factorial(n) / factorial(n-m);
//         System.out.println("Numarul de aranjamente este: " + aranjamente);
//     }

//     public static int factorial(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         } else {
//             return n * factorial(n-1);
//         }
//     }
// }