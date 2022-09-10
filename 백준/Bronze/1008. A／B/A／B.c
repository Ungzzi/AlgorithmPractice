#include <stdio.h>

int main()
{
	double A, B;
	double result;

	scanf("%lf %lf", &A, &B);
	
	result = A / B;

	printf("%.10lf", result);

	return 0;
}