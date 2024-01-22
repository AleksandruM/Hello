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


//  Pentru a determina media aritmetică a numerelor pare ale unui vector, 
//  trebuie să parcurgem vectorul și să adunăm toate numerele pare găsite, 
//  apoi să le împărțim la numărul total de numere pare găsite. 
 
 
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
 
//  Pentru a determina suma elementelor de pe linia a doua a unei matrice, 
//  trebuie să parcurgem linia a doua și să adunăm toate elementele găsite. 
 
 
 public static int sumOfSecondRow(int[][] matrix) {
     int sum = 0;
     for (int j = 0; j < matrix[1].length; j++) {
         sum += matrix[1][j];
     }
     return sum;
 }

 
//  Pentru a determina media aritmetică a elementelor de pe diagonala principală și secundară ale unei matrice, 
//  trebuie să parcurgem diagonalele și să adunăm toate elementele găsite,
//  apoi să le împărțim la numărul total de elemente de pe diagonale. 

 

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

 
 //Pentru a determina media aritmetică a elementelor de pe prima și ultima linie ale unei matrice, 
 //trebuie să parcurgem aceste linii și să adunăm toate elementele găsite, 
 //apoi să le împărțim la numărul total de elemente de pe aceste linii.
 
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

 
 //Pentru a determina suma elementelor de pe prima și ultima coloană ale unei matrice, 
 //trebuie să parcurgem aceste coloane și să adunăm toate elementele găsite. 
 

 public static int sumOfFirstAndLastColumn(int[][] matrix) {
     int sum = 0;
     for (int i = 0; i < matrix.length; i++) {
         sum += matrix[i][0];
         sum += matrix[i][matrix[i].length - 1];
     }
     return sum;
 }

 
 //Pentru a determina dacă litera „b” se conține într-un șir de caractere, 
 //trebuie să căutăm această literă în șirul dat.
 

 public static boolean containsLetterB(String text) {
     return text.contains("b");
 }

 
 //Pentru a determina de câte ori litera „a” se conține într-un șir de caractere, 
 //trebuie să parcurgem șirul și să numărăm de câte ori apare litera „a”. 
 

 public static int countLetterA(String text) {
     int count = 0;
     for (int i = 0; i < text.length(); i++) {
         if (text.charAt(i) == 'a') {
             count++;
         }
     }
     return count;
 }

 
 //Pentru a determina de câte ori cuvântul „UTM” se conține într-un șir de caractere, 
 //trebuie să căutăm acest cuvânt în șirul dat și să numărăm de câte ori apare. 
 
 
 public static int countUTM(String text) {
     int count = 0;
     int index = text.indexOf("UTM");
     while (index != -1) {
         count++;
         index = text.indexOf("UTM", index + 1);
     }
     return count;
 }

 
 //Pentru a număra câte cuvinte sunt într-un șir de caractere, 
 //trebuie să separăm cuvintele din șir și să numărăm câte sunt.
 

 public static int countWords(String text) {
     String[] words = text.split("\\s+");
     return words.length;
 }

 
 //Pentru a înlocui cuvântul „iar” cu cuvântul „dar” într-un șir de caractere, 
 //trebuie să căutăm cuvântul „iar” în șirul dat și să-l înlocuim cu cuvântul „dar”. 
 

 public static String replaceIarWithDar(String text) {
     return text.replaceAll("iar", "dar");
 }





///////////

 
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









 