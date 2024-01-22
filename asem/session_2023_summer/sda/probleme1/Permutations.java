// Problema 3 
// a) Sa se găsească toate permutările mulțimii formate din n elemente ( numărul n se introduce de la
// tastatură) A={a1, a2 ,a3,..., an} de tip INTEGER, elementele căreia se introduc de la tastatură. De
// afișat toate permutările posibile.



import java.util.*;

class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Introduceti elementul " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> result = generatePermutations(A);
        for (ArrayList<Integer> perm : result) {
            System.out.println(perm);
        }
        sc.close();
    }

    static ArrayList<ArrayList<Integer>> generatePermutations(int[] A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>()); // adaugam permutarea vida
        for (int i = 0; i < A.length; i++) {
            int size = result.size();
            for (int j = 0; j < size; j++) {
                ArrayList<Integer> perm = result.remove(0);
                for (int k = 0; k <= perm.size(); k++) {
                    ArrayList<Integer> newPerm = new ArrayList<>(perm);
                    newPerm.add(k, A[i]);
                    result.add(newPerm);
                }
            }
        }
        return result;
    }
}

// Metoda generatePermutations() generează toate permutările mulțimii A și le stochează în ArrayList-ul result. 
// Algoritmul iterativ folosește listă de permutări parțiale și adaugă fiecare element din mulțimea A,
//  în fiecare poziție posibilă a fiecărei permutări parțiale pentru a genera noile permutări.

// Pentru a rula acest cod, trebuie de introdus numărul de elemente și elementele mulțimii A de la tastatură. 
// După rularea programului, vom vedea toate permutările posibile ale mulțimii A.