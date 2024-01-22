// Problema 2 ( Obligatoriu)
// Folosind structuri vectoriale sa se găsească toate permutările mulțimii A={a1, a2 ,a3, a4} de tip INTEGER,
// elementele căreia se introduc de la tastatura. De afișat toate combinările si aranjamentele posibile care
// sunt formate din m=3 elemente.

// Pentru a găsi toate permutările mulțimii A = {a1, a2, a3, a4} de tip INTEGER, putem folosi un algoritm de backtracking. 



import java.util.*;

class Permutations {
    static int[] A;
    static boolean[] used;
    static ArrayList<ArrayList<Integer>> result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = new int[4];
        used = new boolean[4];
        result = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            A[i] = sc.nextInt();
        }
        generatePermutations(new ArrayList<Integer>());
        System.out.println("Permutari:");
        for (ArrayList<Integer> perm : result) {
            System.out.println(perm);
        }
        System.out.println();
        System.out.println("Combinari:");
        generateCombinations(new ArrayList<Integer>(), 0);
        System.out.println();
        System.out.println("Aranjamente:");
        generateArrangements(new ArrayList<Integer>(), 0);
        sc.close();
    }

    static void generatePermutations(ArrayList<Integer> perm) {
        if (perm.size() == A.length) {
            result.add(new ArrayList<Integer>(perm));
            return;
        }
        for (int i = 0; i < A.length; i++) {
            if (!used[i]) {
                used[i] = true;
                perm.add(A[i]);
                generatePermutations(perm);
                perm.remove(perm.size() - 1);
                used[i] = false;
            }
        }
    }

    static void generateCombinations(ArrayList<Integer> comb, int start) {
        if (comb.size() == 3) {
            System.out.println(comb);
            return;
        }
        for (int i = start; i < A.length; i++) {
            comb.add(A[i]);
            generateCombinations(comb, i + 1);
            comb.remove(comb.size() - 1);
        }
    }

    static void generateArrangements(ArrayList<Integer> arr, int start) {
        if (arr.size() == 3) {
            System.out.println(arr);
            return;
        }
        for (int i = start; i < A.length; i++) {
            arr.add(A[i]);
            generateArrangements(arr, start + 1);
            arr.remove(arr.size() - 1);
        }
    }
}


// Metoda generatePermutations() generează toate permutările mulțimii A și le stochează în ArrayList-ul result. 
// Metoda generateCombinations() generează toate combinațiile posibile de m elemente din mulțimea A, 
// iar metoda generateArrangements() generează toate aranjamentele posibile de m elemente din mulțimea A.

// Trebuie de introdus elementele mulțimii A de la tastatură. După rularea programului,
// vom  vedea toate permutările, combinațiile și aranjamentele posibile de m=3 elemente din mulțimea A.