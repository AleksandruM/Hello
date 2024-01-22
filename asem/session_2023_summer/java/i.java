
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
        return 0;
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
