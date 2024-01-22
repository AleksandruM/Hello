
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
