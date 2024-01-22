#include <stdio.h>

int main() {
    char tipFlansa, tipReduct, tipCarcasa;
    int cantitateFlansa, cantitateReduct, cantitateCarcasa;
    int greutateFlansa, greutateReduct, greutateCarcasa;

    printf("Introduceți tipul flanșei: ");
    scanf(" %c", &tipFlansa);

    printf("Introduceți cantitatea flanșei: ");
    scanf("%d", &cantitateFlansa);

    printf("Introduceți greutatea flanșei (în grame): ");
    scanf("%d", &greutateFlansa);

    printf("Introduceți tipul reductorului: ");
    scanf(" %c", &tipReduct);

    printf("Introduceți cantitatea reductorului: ");
    scanf("%d", &cantitateReduct);

    printf("Introduceți greutatea reductorului (în grame): ");
    scanf("%d", &greutateReduct);
    
    printf("Introduceți tipul Carcasei: ");
    scanf(" %c", &tipCarcasa);

    printf("Introduceți cantitatea Carcasei: ");
    scanf("%d", &cantitateCarcasa);

    printf("Introduceți greutatea Carcasei (în grame): ");
    scanf("%d", &greutateCarcasa);
    
    printf("\nInformații introduse:\n");
    printf("Tipul flanșei: %c\n", tipFlansa);
    printf("Cantitatea flanșei: %d\n", cantitateFlansa);
    printf("Greutatea flanșei: %d gr\n", greutateFlansa);
    printf("Tipul reductorului: %c\n", tipReduct);
    printf("Cantitatea reductorului: %d\n", cantitateReduct);
    printf("Greutatea reductorului: %d gr\n", greutateReduct);
    printf("Tipul Carcasei: %c\n", tipCarcasa);
    printf("Cantitatea Carcasei: %d\n", cantitateCarcasa);
    printf("Greutatea Carcasei: %d gr\n", greutateCarcasa);
  return 0;
}
