#include <stdio.h>
#include <time.h>

void afiseazaTimpul(unsigned short timp) {
    int secunde = timp & 0x1F; // utilizam operatorul & pentru a ține doar bitii 0-4
    int minute = (timp >> 5) & 0x3F; // utilizam operatorul >> pentru a muta bitii pentru minute la poziția corectă și apoi & pentru a ține doar bitii 5-10
    int ore = (timp >> 11) & 0x1F; // utilizam operatorul >> pentru a muta bitii pentru ore la poziția corectă și apoi & pentru a ține doar bitii 11-15
    printf("Timpul este: %d ore %d minute %d secunde\n", ore, minute, secunde);
}

int main() {
    time_t rawtime;
    struct tm * timeinfo;
    time (&rawtime);
    timeinfo = localtime (&rawtime);
    int secunde = timeinfo->tm_sec;
    int minute = timeinfo->tm_min;
    int ore = timeinfo->tm_hour;
    // Conversion in given form
    int timp = (ore << 11) | (minute << 5) | secunde;
    afiseazaTimpul(timp);
    return 0;
}
