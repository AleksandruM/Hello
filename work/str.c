#include <unistd.h>
#include <stdio.h>

int  main()
{
	int A;
	int *a = &A;
	double B = 2.3;
	double *b = &B;

	printf("%lu\n", sizeof(A));
	printf("%lu\n", sizeof(a));
	printf("%lu\n", sizeof(B));
	printf("%lu\n", sizeof(b));

}
