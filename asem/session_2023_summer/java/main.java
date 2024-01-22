// Lucrarea individuala


//  Elaborați o aplicație Java în care:
//  1) Se va determina media aritmetică a numerelor pare ale unui vector.
//  2) Se va determina suma elementelor de pe linia a doua ale unei matrice(se
//  vor prelucra toate elementele matricei).
//  3) Se va determina media aritmetică a elementelor de pe diagonala
//  principală și secundară ale unei matrice.
//  4) Se va determina media aritmetică a elementelor de pe prima și ultima
//  linie ale unei matrice(se vor prelucra toate elementele matricei).
//  5) Se va determina suma elementelor de pe prima și ultima coloană ale unei
//  matrice(se vor prelucra toate elementele matricei).
//  6) Se va determina dacă litera „b” se conține într-un șir de caractere.
//  7) Se va determina de câte ori litera „a” se conține într-un șir de caractere
//  8) Se va determina de câte ori cuvântul „UTM” se conține într-un șir de
//  caractere.
//  9) Se va număra câte cuvinte sunt într-un șir de caractere.
//  10) Se va înlocui cuvântul „iar” cu cuvântul „dar” într-un șir de caractere.



public class Main {
    
    public static double averageOfEvenNumbers(int[] vector) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                sum += vector[i];
                count++;
            }
        }
        if (count == 0) {
            return 0
        }
        return sum / count;
    }
    
    public static int sumOfSecondRow(int[][] matrix) {
        int sum = 0;
        for (int j = 0; j < matrix[1].length; j++) {
            sum += matrix[1][j];
        }
        return sum;
    }
    
    public static double averageOfDiagonalElements(int[][] matrix) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                    count++;
                }
            }
        }
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }
    
    public static double averageOfFirstAndLastRow(int[][] matrix) {
        double sum = 0;
        int count = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[0][j];
            count++;
        }
        for (int j = 0; j < matrix[matrix.length - 1].length; j++) {
            sum += matrix[matrix.length - 1][j];
            count++;
        }
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }
    
    public static int sumOfFirstAndLastColumn(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][0];
            sum += matrix[i][matrix[i].length - 1];
        }
        return sum;
    }
    
    public static boolean containsLetterB(String text) {
        return text.contains("b");
    }
    
    public static int countLetterA(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
    
    public static int countUTM(String text) {
        int count = 0;
        int index = text.indexOf("UTM");
        while (index != -1) {
            count++;
            index = text.indexOf("UTM", index + 1);
        }
        return count;
    }
    
    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
    
    public static String replaceIarWithDar(String text) {
        return text.replaceAll("iar", "dar");
    }

    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6};
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String text = "UTM is the best university in Moldova!";
        
        System.out.println("Average of even numbers in vector: " + averageOfEvenNumbers(vector));
        System.out.println("Sum of second row in matrix: " + sumOfSecondRow(matrix));
        System.out.println("Average of diagonal elements in matrix: " + averageOfDiagonalElements(matrix));
        System.out.println("Average of first and last row in matrix: " + averageOfFirstAndLastRow(matrix));
        System.out.println("Sum of first and last column in matrix: " + sumOfFirstAndLastColumn(matrix));
        System.out.println("Does text contain letter b? " + containsLetterB(text));
        System.out.println("Number of letter a in text: " + countLetterA(text));
        System.out.println("Number of UTM in text: " + countUTM(text));
        System.out.println("Number of words in text: " + countWords(text));
        System.out.println("Text with iar replaced by dar: " + replaceIarWithDar(text));
    }
}